package com.dibits.aviva.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dibits.aviva.domain.Promotor;
import com.dibits.aviva.repositories.PromotorRepository;

@Service
public class PromotorService {
	
	@Autowired
	private PromotorRepository repo;
	
	public Promotor buscar(Integer id) {
		
		Optional<Promotor> obj = repo.findById(id);
		return obj.orElse(null); 

	}

}
