package net.jaumebalmes.m12.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.m12.entitats.Curs;
import net.jaumebalmes.m12.repos.CursRepository;

@RestController
public class CursController {
	
	@Autowired     //diu a Spring que crei ell l'objecte
	CursRepository cursRepo; //no cal fer new ja que ho fa Spring
	
	@GetMapping("cursos/{id}")
	public Curs getCurs(@PathVariable long id) {
		
		return cursRepo.findById(id).get();
	}
	
	@GetMapping("cursos")
	public Iterable<Curs> getCurs() {
		
		return cursRepo.findAll();
	}
	
	@PostMapping("cursos")
	public Curs altaCurs(@RequestBody Curs curs) {
		
		cursRepo.save(curs);
		return curs;
	}
	
	@DeleteMapping("cursos/{id}")
    public ResponseEntity<Curs>  deleteCurs(@PathVariable Long id) {
		cursRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
	
	//@PutMapping("alumnes")
	
}
