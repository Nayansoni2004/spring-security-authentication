package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {
//	localhost:9090/pro -> use postman -> select Auth -> basic Auth -> type configured username, pass -> enter
//	localhost:9090/pro -> either with firefox, enter inmemory configured user, pass -> signin
	@GetMapping("/pro")
	public String process() {
		return "Hello! From AppRestController: process()";
	}
}
