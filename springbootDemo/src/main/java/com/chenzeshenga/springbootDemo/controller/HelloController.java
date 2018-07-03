package com.chenzeshenga.springbootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class HelloController {

	@RequestMapping(value = "/sayHello", method = RequestMethod.GET)
	public String sayHello() {
		return "hello world";
	}

}
