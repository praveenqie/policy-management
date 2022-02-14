package com.policy.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class PolicyDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String policyName;
	
	private Double aamountPaid;
	
	private Date policyEndDate;
	
	private boolean valid;
	
	@ManyToOne
	private Users users;

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public Double getAamountPaid() {
		return aamountPaid;
	}

	public void setAamountPaid(Double aamountPaid) {
		this.aamountPaid = aamountPaid;
	}

	public Date getPolicyEndDate() {
		return policyEndDate;
	}

	public void setPolicyEndDate(Date policyEndDate) {
		this.policyEndDate = policyEndDate;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public PolicyDetails(String policyName, Double aamountPaid, Date policyEndDate, boolean valid, Users users) {
		super();
		this.policyName = policyName;
		this.aamountPaid = aamountPaid;
		this.policyEndDate = policyEndDate;
		this.valid = valid;
		this.users = users;
	}

	public PolicyDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PolicyDetails [id=" + id + ", policyName=" + policyName + ", aamountPaid=" + aamountPaid
				+ ", policyEndDate=" + policyEndDate + ", valid=" + valid + ", users=" + users + "]";
	}
	
	
	
}
