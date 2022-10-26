package net.jaumebalmes.m12.controller;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
import net.jaumebalmes.m12.entitats.Curs;
import net.jaumebalmes.m12.repos.CursRepository;
import net.jaumebalmes.m12.repos.AlumnesRepository;

@RestController
public class AlumnesController {
	
	@Autowired     //diu a Spring que crei ell l'objecte
	AlumnesRepository alumneRepo; //no cal fer new ja que ho fa Spring
	
	@GetMapping("alumne/{id}")
	public Alumne getAlumne(@PathVariable long id) {
		
		return alumneRepo.findById(id).get();
	}
	
	@GetMapping("alumnes/{grup}")
	public Alumne getAlumneGrup(@PathVariable String grup) {
		
		
		return null;
	}
	
	@GetMapping("alumnes")
	public Iterable<Alumne> getAlumnes() {
		
		return alumneRepo.findAll();
	}
	
	@PostMapping("alumnes")
	public Alumne altaClient(@RequestBody Alumne alumne) {
		
		alumneRepo.save(alumne);
		

	public Alumne altaAlumne(@RequestBody Alumne alumne) {
		
		alumneRepo.save(alumne);

		return alumne;
	}
	
	@DeleteMapping("alumnes/{id}")
    public ResponseEntity<Alumne>  deleteAlumne(@PathVariable Long id) {
		alumneRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
	//@DeleteMapping("clients/{id}")
	
	//@PutMapping("clients")

	//@PutMapping("alumnes")



}