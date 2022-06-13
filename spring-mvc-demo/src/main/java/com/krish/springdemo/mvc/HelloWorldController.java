package com.krish.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// new controller method to read form data and
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// get the value from the form using request.getParameter()
		String theName = request.getParameter("studentName");
		
		// convert the data to uppercase
		theName = theName.toUpperCase();
		
		// create a message
		String result = "Yo! " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
}
