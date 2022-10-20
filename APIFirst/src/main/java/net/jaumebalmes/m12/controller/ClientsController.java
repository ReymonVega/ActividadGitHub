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

import net.jaumebalmes.m12.entitats.Client;
import net.jaumebalmes.m12.repos.clientsRepo;

@RestController
@RequestMapping("api")
public class ClientsController {
	
	@Autowired     //diu a Spring que crei ell l'objecte
	clientsRepo clientRep; //no cal fer new ja que ho fa Spring
	
	@GetMapping("clients/{id}")
	public Client getClient(@PathVariable long id) {
		
		return clientRep.findById(id).get();
	}
	
	@GetMapping("clients")
	public Iterable<Client> getClients() {
		
		return clientRep.findAll();
	}
	
	@PostMapping("clients")
	public Client altaClient(@RequestBody Client client) {
		
		clientRep.save(client);
		
		return client;
	}
	
	//@DeleteMapping("clients/{id}")
	
	//@PutMapping("clients")


}
