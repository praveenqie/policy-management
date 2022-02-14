package com.policy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.policy.dto.LoginRequestDTO;
import com.policy.dto.PolicyDetailsResponseDTO;
import com.policy.dto.RegisterUserRequestDTO;
import com.policy.dto.Response;
import com.policy.entity.Policies;
import com.policy.entity.PolicyDetails;
import com.policy.exceptions.PolicyExceptions;
import com.policy.service.PolicyService;

@RestController
public class PolicyController {

	@Autowired
	private PolicyService policyService;

	@PostMapping(path = "/register",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> register(@RequestBody RegisterUserRequestDTO registerUserRequestDTO) {
		try {
			Response response = policyService.register(registerUserRequestDTO);
			return ResponseEntity.status(HttpStatus.OK).body(response);
		} catch (PolicyExceptions e) {
			return ResponseEntity.badRequest().body(new Response("Error while Registering user", 400));
		}

	}

	@PostMapping(path = "/login",consumes = MediaType.APPLICATION_JSON_VALUE)
	public  ResponseEntity<Object> login(@RequestBody LoginRequestDTO loginrequestDTO) {
		try {
			Response response = policyService.performLogin(loginrequestDTO);
			return ResponseEntity.status(HttpStatus.OK).body(response);
		} catch (PolicyExceptions e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Response( e.getMessage(),500));
		}
	}

	@GetMapping(path = "/getPolicies")
	private ResponseEntity<Object> getPolicy() {
		try {
			List<Policies> policies = policyService.getPolicy();
			return ResponseEntity.status(HttpStatus.OK).body(policies);
		} catch (PolicyExceptions e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Response(e.getMessage(), 400));
		}
	
	}
	
	@GetMapping(path = "/getPolicies/{custId}")
	private ResponseEntity<Object> getPolicyDetails(@PathVariable("custId") Long custId) {
		try {
			List<PolicyDetails> policies= policyService.getPolicyDetails(custId);
			return ResponseEntity.status(HttpStatus.OK).body(policies);
		} catch (PolicyExceptions e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Response(e.getMessage(), 400));
		}
	
	}


}
