package com.policy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Policies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String policyName;
	
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

	public Policies(String policyName, String policyDetails) {
		super();
		this.policyName = policyName;
		this.policyDetails = policyDetails;
	}

	public Policies() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Policies [id=" + id + ", policyName=" + policyName + ", policyDetails=" + policyDetails + "]";
	}
	
	
	
	
	
}
