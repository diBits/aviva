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
		
		Promotor obj = service.find(id);
		return ResponseEntity.ok().body(obj);
		
	}
}