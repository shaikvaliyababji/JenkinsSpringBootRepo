package com.klef;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    
	@GetMapping("/")
	 public String home()
	 {
		 return "welcome to CI/CD   build 2.0";
	 }
	
	@GetMapping("/demo")
	 public String demo()
	 {
		 return "test";
	 }
	
	@GetMapping("/home")
	 public String h()
	 {
		 return "deploy sprom=ngboot using jenkins " ;
	 }
	
}
