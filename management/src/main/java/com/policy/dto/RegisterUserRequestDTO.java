package com.policy.dto;

import java.sql.Date;

public class RegisterUserRequestDTO {

	private String firstName;
	
	private String lastName;
	
	private Date dob;
	
	private String address;
	
	private Long contactNumber;
	
	private String email;
	
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RegisterUserRequestDTO(String firstName, String lastName, Date dob, String address, Long contactNumber,
			String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.address = address;
		this.contactNumber = contactNumber;
		this.email = email;
		this.password = password;
	
	}

	public RegisterUserRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RegisterUserRequestDTO [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", address=" + address + ", contactNumber=" + contactNumber + ", email=" + email + ", password="
				+ password + ", confirmPassword=" + "]";
	}
	
	
}
