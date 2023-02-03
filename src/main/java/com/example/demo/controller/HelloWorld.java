package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
public class HelloWorld {

	@RestController
	@RequestMapping("/api")
	public class HelloWorldController {
	 
	    @RequestMapping("/")
	    public String welcome() {//Welcome page, non-rest
	        return "Welcome to RestTemplate Example.";
	    }
	 
	    @RequestMapping("/hello/{name}")
	    public Greeting message(@PathVariable String name) {
	 
	        Greeting  msg = new Greeting(name, "Hello " + name);
	        return msg;
	    }
}
