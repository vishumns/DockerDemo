package com.docker.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String get() {
		System.out.println("vishal *********************");
		return "HI";
	}
}
