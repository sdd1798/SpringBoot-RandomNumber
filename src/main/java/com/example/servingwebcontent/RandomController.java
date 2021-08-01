package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RandomController {

	@GetMapping("/random")
	public String random(Model model) {
		model.addAttribute("number", (int)(Math.random()*(1000-1+1)+1));
		return "random";
	}

}
