package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.entities.Employee;
import com.isrdc.services.EmployeeService;

@RestController
public class EmployeeRestController {
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@PostMapping("/signup")
	public ResponseEntity<String> signUpEmployee(@RequestBody Employee employee) {
		String encryptedPassword = passwordEncoder.encode(employee.getPassword());
		employee.setPassword(encryptedPassword);
		
		employeeService.saveEmployee(employee);
		return new ResponseEntity("Congratulations!!! SignUp Successful...", HttpStatus.CREATED);
	}
}
