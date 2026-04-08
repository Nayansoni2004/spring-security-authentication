package com.isrdc.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.isrdc.services.EmployeeService;

@Configuration
@EnableWebSecurity
public class AppSecurityConfiguration {
	@Autowired
	private EmployeeService employeeService;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain securityCofig(HttpSecurity httpsecurity) {
		httpsecurity.authorizeHttpRequests(req -> req
													.requestMatchers("/signup", "/signin").permitAll()
													.anyRequest().authenticated())
					.httpBasic(Customizer.withDefaults())
					.formLogin(Customizer.withDefaults());
		
		return httpsecurity.csrf(csrf -> csrf.disable()).build();
	}
}
