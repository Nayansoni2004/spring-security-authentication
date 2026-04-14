package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {
//	http://localhost:9090/pro -> use firefox browser to see login page again & again as it does not store pages in history
//	if testing using postman then -> GET -> type url -> select Auth -> select Auth Type as -> Basic Auth -> type user & password -> enter
	@GetMapping("/pro")
	public String process() {
		return "Hello From AppRestController: process()";
	}
	
//	http://localhost:9090/info -> use firefox browser to see login page again & again as it does not store pages in history
	@GetMapping("/info")
	public String information() {
		return "Hello From AppRestController: information()";
	}
}
