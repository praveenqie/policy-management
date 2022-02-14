package com.policy.exceptions;

@SuppressWarnings("serial")
public class PolicyExceptions extends Exception{
	public  PolicyExceptions(){
		
	}
	public PolicyExceptions(String message){
		super(message);
	}
}
