package com.lanqiao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lanqiao.model.User;
import com.lanqiao.service.UserService;

@RestController
@RequestMapping("")

public class UserRestController {
	@Autowired
	private UserService uservice;
	@GetMapping("user/{id}")
	
	  public User getc(@PathVariable("id")int userid) {
		  User u = new User();
		return u;
		  
	  }
	
	   
}







