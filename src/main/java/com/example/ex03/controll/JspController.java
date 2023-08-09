package com.example.ex03.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class JspController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		
		//log.info("JspController.home()============>");
		model.addAttribute("msg", "Hello Spring Boot JSP");
		return "home";
	}

}
