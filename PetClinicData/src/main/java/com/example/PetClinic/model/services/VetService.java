package com.example.PetClinic.model.services;

import java.util.Set;


import com.example.PetClinic.model.Pet;

public interface VetService {

	
Pet findById(Long Id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();

	
}
