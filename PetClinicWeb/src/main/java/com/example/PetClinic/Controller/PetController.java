package com.example.PetClinic.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {
	
	//@RequestMapping({"","/","index","index.html"})
	public String index() {
		return "index";
	}
	

}
