package com.coderscampus.JobTrackingApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
// THIS CONTROLLER IS FOR TESTING PURPOSES
	
	@GetMapping("/error")
	public String getErrorMessage () {
		return "redirect:/error";
	}
	
	@GetMapping("/userExists")
	public String getUserExistsMessage () {
		return "redirect:/signin";
	}
	

}
