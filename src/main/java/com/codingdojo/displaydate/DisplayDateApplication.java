package com.codingdojo.displaydate;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class DisplayDateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayDateApplication.class, args);
	}
	
	@GetMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new java.util.Date();
		model.addAttribute("date", date);
		
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date time = new java.util.Date();
		model.addAttribute("time", time);
		return "time.jsp";
	}
}
