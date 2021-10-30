package com.amock.helloazure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		 
		return "Hello World!!!!";
	}
	
	
	
	@GetMapping(path="/hello-world/{name}")
	public String helloWorldPathVariable(@PathVariable String name) {
		 
		return "Hello World Welcome "+name+" !!!...";
	}

}
