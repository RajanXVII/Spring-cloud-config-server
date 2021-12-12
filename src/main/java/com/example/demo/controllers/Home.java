package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	@RequestMapping("/")
public String mainPage() {
		return "Main Page!!";
	}
}
