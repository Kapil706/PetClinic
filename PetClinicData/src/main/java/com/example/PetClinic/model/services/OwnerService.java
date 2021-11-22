package com.example.PetClinic.model.services;

import java.util.Set;

import com.example.PetClinic.model.Owner;

public interface OwnerService {
	
	
	Owner findByLastName(String LastName);
	
	Owner findById(Long Id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();

}
