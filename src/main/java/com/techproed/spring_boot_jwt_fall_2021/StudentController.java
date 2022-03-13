package com.techproed.spring_boot_jwt_fall_2021;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping(path="/students")
	public String getStudents() {
		return "Ali Can, Veli Han, Kemal Kuzu";
	}
	
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private MyUserDetailsService myUserDetailsService;
	@Autowired
	private JwtUtil jwtUtil;
	
	@PostMapping(value="/authenticate")
	public ResponseEntity<?> createAuthenticationToken(){
	
		
		return null;
	}
	
	
	
}
