package com.example.PetClinic.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.PetClinic.model.services.OwnerService;


@RequestMapping({"/owners"})
@Controller
public class OwnerController {
	
	private final OwnerService ownerService;
	
	
	
	
	
	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}





	@RequestMapping({"","/","/index","/index.html"})
	public String OwnersList(Model model) {
		
		model.addAttribute("owners", ownerService.findAll());
		
		return "owners/index";
	}

}
