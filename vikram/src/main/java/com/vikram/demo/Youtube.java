package com.vikram.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Youtube {
	@GetMapping("/login")
     public String youtube(@RequestParam String username,@RequestParam String password)
     {
    	 if(username.equals("thanushiya")&& password.equals("12349"))
    	 {
    		 return "Login Successfully";
    	 }
    	 else
    	 {
    		 return "Login fails pleaseeeeee check your username and password!";
    	 }
     }

}
