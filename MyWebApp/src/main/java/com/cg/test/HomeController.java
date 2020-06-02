package com.cg.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home(
			@RequestParam(value="name", defaultValue = "world",required = true) String name,
			@RequestParam(value="age", defaultValue = "world",required = true) int age,
			Model model
			)
	{
		System.out.println("Home called name="+name +"\t age ="+age);
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "home";
	}

}
