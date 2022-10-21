package net.jaumebalmes.m12.controller;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.m12.entitats.Alumne;
import net.jaumebalmes.m12.repos.AlumnesRepository;

@RestController
@RequestMapping("api")
public class AlumnesController {
	
	@Autowired     //diu a Spring que crei ell l'objecte
	AlumnesRepository alumeRepo; //no cal fer new ja que ho fa Spring
	
	@GetMapping("clients/{id}")
	public Alumne getClient(@PathVariable long id) {
		
		return alumeRepo.findById(id).get();
	}
	
	@GetMapping("clients")
	public Iterable<Alumne> getClients() {
		
		return alumeRepo.findAll();
	}
	
	@PostMapping("clients")
	public Alumne altaClient(@RequestBody Alumne client) {
		
		alumeRepo.save(client);
		
		return client;
	}
	
	//@DeleteMapping("clients/{id}")
	
	//@PutMapping("clients")


}