package com.policy.dto;

import java.util.List;

import com.policy.entity.PolicyDetails;
import com.policy.entity.Users;

public class UsersPolicyResponseDTO {

	private List<PolicyDetails> policyDetails ;
	
	private Users users;

	public List<PolicyDetails> getPolicyDetails() {
		return policyDetails;
	}

	public void setPolicyDetails(List<PolicyDetails> policyDetails) {
		this.policyDetails = policyDetails;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public UsersPolicyResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersPolicyResponseDTO(List<PolicyDetails> policyDetails, Users users) {
		super();
		this.policyDetails = policyDetails;
		this.users = users;
	}
	
	
	
}
