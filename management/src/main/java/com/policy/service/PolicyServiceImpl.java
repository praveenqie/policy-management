package com.policy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer;
import com.policy.dto.LoginRequestDTO;
import com.policy.dto.PolicyDetailsResponseDTO;
import com.policy.dto.RegisterUserRequestDTO;
import com.policy.dto.Response;
import com.policy.entity.Policies;
import com.policy.entity.PolicyDetails;
import com.policy.entity.Users;
import com.policy.exceptions.PolicyExceptions;
import com.policy.repository.PoliciesRepository;
import com.policy.repository.PolicyDetailsRepository;
import com.policy.repository.UsersRepository;

@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	private PoliciesRepository policiesRepository;

	@Autowired
	private UsersRepository usersRepossitory;

	@Autowired
	private PolicyDetailsRepository policyDetailsRepository;

	@Override
	public Response register(RegisterUserRequestDTO registerUserRequestDTO) throws PolicyExceptions {
		if (Objects.isNull(registerUserRequestDTO)) {
			throw new PolicyExceptions("request should not be empty");
		}
		Users users = new Users(registerUserRequestDTO.getFirstName(), registerUserRequestDTO.getLastName(),
				registerUserRequestDTO.getDob(), registerUserRequestDTO.getAddress(),
				registerUserRequestDTO.getContactNumber(), registerUserRequestDTO.getEmail(),
				registerUserRequestDTO.getPassword());
		usersRepossitory.save(users);
		return new Response("User Registered Successfully!", 200);
	}

	@Override
	public Response performLogin(LoginRequestDTO loginrequestDTO) throws PolicyExceptions {
		if (Objects.isNull(loginrequestDTO.getCustId()) || Objects.isNull(loginrequestDTO.getPassword())) {
			throw new PolicyExceptions("Customer id Or password should not be empty");
		}
		Optional<Users> usersOptional = usersRepossitory.findById(loginrequestDTO.getCustId());

		if (!usersOptional.isPresent()) {
			throw new PolicyExceptions("Customer is not found!");
		}

		Users users = usersOptional.get();
		if (!users.getPassword().equals(loginrequestDTO.getPassword())) {
			throw new PolicyExceptions("Entered password is wrong!");
		}
		return new Response("Loggin successfull!", 200);
	}

	@Override
	public List<Policies> getPolicy() throws PolicyExceptions {
		return policiesRepository.findAll();
	}

	@Override
	public List<PolicyDetails> getPolicyDetails(Long custId) throws PolicyExceptions {
		List<PolicyDetails> details = new ArrayList<PolicyDetails>();
		if(!Objects.nonNull(custId) && custId >0) {
			throw new PolicyExceptions("customer id is invaild");
		}
		//details = policyDetailsRepository.findAll();
		details =  policyDetailsRepository.getPolicyDetailsByCustId(custId);
		return details;
		
	}

}
