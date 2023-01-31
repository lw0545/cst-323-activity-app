package com.gcu.busiuness;

import org.springframework.stereotype.Service;

@Service
public class SecurityBusinessService 
{
	public boolean authenticate(String username, String password)
	{
		System.out.println("Hello from the SecurityBusinessService");
		return true;
	}
}
