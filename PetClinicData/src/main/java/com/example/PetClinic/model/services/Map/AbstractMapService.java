package com.example.PetClinic.model.services.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.example.PetClinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {
	
	 protected Map<Long,T> map = new HashMap<>();
	 
	 
	 Set<T> findAll(){
		 
		 return new HashSet<>(map.values());
		 
	 }
	 
	 T findById(ID Id) {
		return map.get(Id);
		 
		
		
	 }
	
	 
	 T save( T object) {
		 
		 if(object!=null) {
			 if(object.getId()==null) {
				 object.setId(getNextId());
			 }
		 }
		 map.put(object.getId(), object);
		 return object;
	 }
	 
	 
	 void deleteById(ID Id) {
		 map.remove(Id);
	 }
	 
	 
	 void delete(T object) {
		 
		 map.entrySet().removeIf(entry->entry.getValue().equals(object));
		 
	 }
	 
	 private Long getNextId() {
		 
		 Long nextId = null;
		 
		 try {
			 
			 nextId = Collections.max(map.keySet())+1;
		 }catch(NoSuchElementException e) {
			 nextId=1L;
		 }
		 
		 return nextId;
		 
	 }

}
