package com.example.PetClinic.model.services.Map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.PetClinic.model.Owner;
import com.example.PetClinic.model.services.CrudService;
import com.example.PetClinic.model.services.OwnerService;


@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService{

	    @Override
	    public Set<Owner> findAll() {
	        return super.findAll();
	    }

	    @Override
	    public Owner findById(Long id) {
	        return super.findById(id);
	    }

	    @Override
	    public Owner save(Owner object) {
	        return super.save( object);
	    }

	    @Override
	    public void delete(Owner object) {
	        super.delete(object);
	    }

	    @Override
	    public void deleteById(Long id) {
	        super.deleteById(id);
	    }

		@Override
		public Owner findByLastName(String LastName) {
			// TODO Auto-generated method stub
			return null;
		}

	



}
