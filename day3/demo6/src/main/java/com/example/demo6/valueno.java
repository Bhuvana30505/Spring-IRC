package com.example.demo6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class valueno {
	@Value("${carname:'BMW'}")
	public String car;
	@GetMapping("/kar")
	@ResponseBody
	public String car()
	{
		return "My fvrt car"+car;
	}

}
