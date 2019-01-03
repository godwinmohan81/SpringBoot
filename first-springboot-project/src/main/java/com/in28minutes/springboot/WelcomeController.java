package com.in28minutes.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.springboot.service.WelcomeService;

@RestController
public class WelcomeController {
	
	/*private WelcomeService welcomeService = new WelcomeService();*/
	
	@Autowired
	private WelcomeService welcomeService;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return welcomeService.returnWelcomeMsg();
	}
/*	@Component
	class WelcomeService{
		
		public String returnWelcomeMsg() {
			return "Godwin First Spring Boot Application Welcome Service Autowired";
			
		}
	}*/

}
