package com.example.PetClinic.bootStrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.PetClinic.model.Owner;
import com.example.PetClinic.model.Vet;
import com.example.PetClinic.model.services.OwnerService;
import com.example.PetClinic.model.services.VetService;
import com.example.PetClinic.model.services.Map.OwnerServiceMap;
import com.example.PetClinic.model.services.Map.VetServiceMap;


@Component
public class DataLoader implements CommandLineRunner{
	
	
	private final OwnerService ownerService;
	
	private final VetService vetService;
	
	
//	public DataLoader() {
//		
//		this.ownerService = new OwnerServiceMap();
//		this.vetService = new VetServiceMap();
//		
//		
//	}

	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}
	
	

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		
		owner1.setId(1L);
		owner1.setFirstName("Kapil");
		owner1.setLastName("Chaudhary");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Lalit");
		owner2.setLastName("Kumar");
		
		
		System.out.println("Load Owners......");
		
		
		
		Vet vet1 = new Vet();
		
		vet1.setId(3L);
		vet1.setFirstName("Viren");
		vet1.setLastName("Kumar");
		
		vetService.save(vet1);
		
		
		Vet vet2 = new Vet();
		
		vet2.setId(4L);
		vet2.setFirstName("Mayur");
		vet2.setLastName("joshi");
		
		vetService.save(vet2);
		
		System.out.println("Load Vets....");
		
	}




}
