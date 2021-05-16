package com.AWS.CodeCommit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {
    @GetMapping("/")
	public String welcome() {
    	return "Welcome to My Demo Spring Boot project! This is now test to verify CodePipeline";
    }
}
