package com.imran.validation;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class RequestInfo {

	@Email
	private String email;
	
	@Size(min = 5, max = 255, message = "Please enter between {min} and {max} characters.")
	private String text;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "RequestInfo [email=" + email + ", text=" + text + "]";
	}

}