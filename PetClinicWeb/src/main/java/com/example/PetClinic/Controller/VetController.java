package com.example.PetClinic.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
	@RequestMapping({"/vets","vets/index.html", "/vets/index"})
	public String vetsList() {
		
		return "vets/index";
	}

}
