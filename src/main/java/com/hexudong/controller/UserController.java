package com.hexudong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.hexudong.service.UserService;



@Controller
public class UserController {

	@Autowired
	private UserService service;

	public static void main(String[] args) {
		System.out.println("hello word");
	}
	
}
