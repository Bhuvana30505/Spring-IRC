package com.example.day1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class student { 
	@RequestMapping("/")
	@ResponseBody
	public String welcome()
	{
		return"welcome to class";
	}

}

