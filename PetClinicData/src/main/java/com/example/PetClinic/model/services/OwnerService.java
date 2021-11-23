package com.example.PetClinic.model.services;


import com.example.PetClinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	
	Owner findByLastName(String LastName);
	
	

}
