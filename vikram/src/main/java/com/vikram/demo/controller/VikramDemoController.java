package com.vikram.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class VikramDemoController {
	@GetMapping("/loki")
	public String amar(@RequestParam String username)
	{
		return"Hey "+username+" Aarambiklangla?";
	}
}

