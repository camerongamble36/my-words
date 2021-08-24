package com.genesis.mywords.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping("/")
	//Can you use RequestMapping instead?
	public String hello() {
		return "Hello world! Time on server is" + LocalDateTime.now();
	}

	// expose new endpoint for workout
	@GetMapping("/workout")
	public String workout() {
		return "This is a workout";
	}
}
