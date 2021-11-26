package com.example.PetClinic.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.PetClinic.model.services.VetService;

@RequestMapping({"/vets"})
@Controller
public class VetController {
	
	private final VetService vetService;
	
	
	
	
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}




	@RequestMapping({"","/","/index","/index.html"})
	public String vetsList(Model model) {
		
		model.addAttribute("Vets", vetService.findAll());
		
		return "vets/index";
	}

}
