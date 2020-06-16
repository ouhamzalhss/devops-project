package com.ouhamza.devops.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	@RequestMapping("/")
	public String welcome(Model model) {
		logger.info("just a test info log");
		model.addAttribute("course","DevOps");
		return "index";
	}
}
