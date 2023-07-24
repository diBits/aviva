package com.dibits.aviva.services;

import java.util.Optional;

import com.dibits.aviva.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dibits.aviva.domain.Promotor;
import com.dibits.aviva.repositories.PromotorRepository;

@Service
public class PromotorService {

	@Autowired
	private PromotorRepository repo;

	public Promotor find(Integer id) {
		Optional<Promotor> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo:" + Promotor.class.getName()));
	}

}
