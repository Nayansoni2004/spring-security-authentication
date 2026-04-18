package com.isrdc.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class InMemorySecurity {
	@Bean
	public InMemoryUserDetailsManager inMemoryUsers() {
		
		UserDetails user1 = User.withDefaultPasswordEncoder().username("rahul").password("12@mno").build();
		UserDetails user2 = User.withDefaultPasswordEncoder().username("aman").password("13@abc").build();
		UserDetails user3 = User.withDefaultPasswordEncoder().username("ram").password("14@pqr").build();
		UserDetails user4 = User.withDefaultPasswordEncoder().username("shyam").password("15@xyz").build();
		
		return new InMemoryUserDetailsManager(user1, user2, user3, user4);
	}
}
