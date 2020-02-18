package com.ITAcademy.restproject.Controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

	private static final String template = "Hello, %s";

	private final AtomicLong counter = new AtomicLong();
	

	@RequestMapping("/greetings")
	public Greetings greetings(@RequestParam(value = "name",required=false, defaultValue = "World") String name) {

		return new Greetings(counter.incrementAndGet(), String.format(template, name));

	}

}
