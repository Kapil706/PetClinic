package com.example.PetClinic.model.services;

import java.util.Set;

import com.example.PetClinic.model.Owner;
import com.example.PetClinic.model.Pet;

public interface PetService {

	
Pet findById(Long Id);
	
	Owner save(Pet pet);
	
	Set<Pet> findAll();

	
}
