package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {
//	localhost:9090/pro -> use postman -> select auth -> Basic Auth -> username-rahul pass-rahul@123
//	localhost:9090/pro -> either use firefox & rewrite the same credentials as configured in yml
	@GetMapping("/pro")
	public String process() {
		return "Hello From AppRestController: process()";
	}
}
