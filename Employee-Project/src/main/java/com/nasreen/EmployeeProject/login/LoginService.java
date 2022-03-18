package com.nasreen.EmployeeProject.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String name,String password) {
		return name.equalsIgnoreCase("admin") && password.equals("dummy");
	}

}
