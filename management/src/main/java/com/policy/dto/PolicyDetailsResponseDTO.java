package com.policy.dto;

public class PolicyDetailsResponseDTO {
	
	private String  policyName;
	
	private String policyDetails;

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyDetails() {
		return policyDetails;
	}

	public void setPolicyDetails(String policyDetails) {
		this.policyDetails = policyDetails;
	}

	public PolicyDetailsResponseDTO(String policyName, String policyDetails) {
		super();
		this.policyName = policyName;
		this.policyDetails = policyDetails;
	}

	public PolicyDetailsResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PolicyDetailsResponseDTO [policyName=" + policyName + ", policyDetails=" + policyDetails + "]";
	}
	
	
	

}
