package com.example.Kabbadi1.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Kabbadi1.Service.LoginService;
import com.example.Kabbadi1.model.LoginPage;

@RestController

public class LoginController {
	@Autowired
	private LoginService lser;
	//login
	@PostMapping("/login")
	public String Login(@RequestBody Map<String,String>loginData) {
	
		String username = loginData.get("username");
		String password = loginData.get("password");
		String result = lser.checkLogin(username,password);
		return result;
	}
	
	
	//posting the details
	@PostMapping("/post")
	public LoginPage adddetails(@RequestBody LoginPage id)
	{
		return lser.adddetails(id);
	}

}
