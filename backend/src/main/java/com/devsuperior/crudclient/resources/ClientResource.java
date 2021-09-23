package com.devsuperior.crudclient.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.crudclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		Instant data = Instant.now();
		list.add(new Client(1L, "Samuel", "000.000.000-00" ,2.100 ,data, 0));
		list.add(new Client(2L, "Zé", "000.000.000-01", 3.500, data, 2));
		return ResponseEntity.ok().body(list);
	}
}
