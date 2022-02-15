package com.policy.service;

import java.util.List;

import com.policy.dto.LoginRequestDTO;
import com.policy.dto.PolicyDetailsResponseDTO;
import com.policy.dto.RegisterUserRequestDTO;
import com.policy.dto.Response;
import com.policy.dto.UsersPolicyResponseDTO;
import com.policy.entity.Policies;
import com.policy.entity.PolicyDetails;
import com.policy.exceptions.PolicyExceptions;

public interface PolicyService {

	public Response register(RegisterUserRequestDTO registerUserRequestDTO) throws PolicyExceptions;

	public Response performLogin(LoginRequestDTO loginrequestDTO)throws PolicyExceptions;

	public List<Policies> getPolicy()throws PolicyExceptions;

	public UsersPolicyResponseDTO getPolicyDetails(Long custId) throws PolicyExceptions;

}
