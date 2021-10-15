package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {
	@RequestMapping("/home")
	public ModelAndView homemethod() {
		ModelAndView modela = new ModelAndView();
		modela.setViewName("index.jsp");
		System.out.println("im here");
		return modela;
	}
}
