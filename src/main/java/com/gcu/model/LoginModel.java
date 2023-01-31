package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginModel
{
	
	@NotNull(message="User name is a required field")
	@Size(min=1, max=32, message="User Name must be between 1 and 32 characters")
	private String username;
	
	@NotNull(message="Password is a required field")
	@Size(min=1, max=32, message="Password must be between 1 and 32 characters")
	private String password;
	
	public LoginModel(String username, String password)
	{
		this.username = username;
		this.password = password;
	}
	
	public LoginModel()
	{
		this.username = "";
		this.password = "";
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
}