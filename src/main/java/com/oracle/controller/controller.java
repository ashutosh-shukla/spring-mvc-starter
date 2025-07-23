package com.oracle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class controller {
	
	@GetMapping(path= "/sayhello.do")
	public String sayhello()
	{
		return "customer";
	}
	
}
