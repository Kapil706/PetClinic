package com.example.PetClinic.model.services.Map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.PetClinic.model.Pet;

import com.example.PetClinic.model.services.CrudService;
import com.example.PetClinic.model.services.PetService;


@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    
	 @Override
	    public Set<Pet> findAll() {
	        return super.findAll();
	    }
	    @Override
	    public Pet findById(Long id) {
	        return super.findById(id);
	    }

	    @Override
	    public Pet save(Pet object) {
	        return super.save(object.getId(), object);
	    }

	    @Override
	    public void delete(Pet object) {
	        super.delete(object);
	    }

	    @Override
	    public void deleteById(Long id) {
	        super.deleteById(id);
	    }

	
}
