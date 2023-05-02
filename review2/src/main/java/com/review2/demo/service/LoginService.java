package com.review2.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.review2.demo.model.Loginpage;
import com.review2.demo.repository.LoginRepo;

@Service
public class LoginService {
	@Autowired
	LoginRepo lrep;
	
	public Loginpage saveUser(Loginpage l)
	{
		return lrep.save(l);
	}
	
	public String validateUser(String username,String password)
	{
		String result="";
		Loginpage l=lrep.findByUsername(username);
		if(l==null)
		{
			result="Invalid user";
		}
			else
			{
				if(l.getPassword().equals(password))
				{
					result="Login success";
				}
				else
				{
					result="Login failed";
				}
			}
		

		return result;
		}
}
