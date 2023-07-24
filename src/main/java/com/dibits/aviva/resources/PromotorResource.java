package com.dibits.aviva.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dibits.aviva.domain.Promotor;
import com.dibits.aviva.services.PromotorService;

@RestController
@RequestMapping(value="/promotores")
public class PromotorResource {
	
	@Autowired
	private PromotorService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Promotor obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
		/*
		 * Promotor prom1 = new Promotor(01, "Diogo Martins", 50, 12, "HP"); Promotor
		 * prom2 = new Promotor(02, "Marcos Vinicius", 75, 16, "HP"); Promotor prom3 =
		 * new Promotor(03, "Jeferson Xavier", 90, 19, "HP");
		 * 
		 * List<Promotor> lista = new ArrayList<>(); lista.add(prom1); lista.add(prom2);
		 * lista.add(prom3);
		 * 
		 * return lista;
		 */
	}
}