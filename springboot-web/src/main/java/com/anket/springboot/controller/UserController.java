package com.anket.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anket.springboot.entity.Users;
import com.anket.springboot.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService  userService;
	
	@GetMapping(value="/users") 
	public List<Users> getUsers() {
		
		return userService.findAll();
	}

}
