package com.app.dto;

import java.util.HashSet;
import java.util.Set;

import com.app.pojos.Role;

public class UserResponseDTO 
{
	private Integer id;	
	private String userName;
	private Long contact;
	private String email;
	private boolean active;
	private Set<Role> roles = new HashSet<>();

	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public boolean isActive() 
	{
		return active;
	}
	public void setActive(boolean active)
	{
		this.active = active;
	}
	public Set<Role> getRoles()
	{
		return roles;
	}
	public void setRoles(Set<Role> roles)
	{
		this.roles = roles;
	}
	public Long getContact() 
	{
		return contact;
	}
	public void setContact(Long contact) 
	{
		this.contact = contact;
	}
	@Override
	public String toString() 
	{
		return "UserResponseDTO [id=" + id + ", userName=" + userName + ", email=" + email + ", active=" + active
				+ ", roles=" + roles + "]";
	}
}
