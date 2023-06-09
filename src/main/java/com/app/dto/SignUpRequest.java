package com.app.dto;

import java.util.Set;

public class SignUpRequest {
	private String userName,email, password;
	private Long contact;
	private Set<String> roles;

	
	
	
	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}
	

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "SignUpRequest [userName=" + userName + ", email=" + email + ", password=" + password + ", contact="
				+ contact + ", roles=" + roles + "]";
	}




	

}
