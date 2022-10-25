package net.jaumebalmes.m12.controller;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
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
public class AlumnesController {
	
	@Autowired     //diu a Spring que crei ell l'objecte
	AlumnesRepository alumeRepo; //no cal fer new ja que ho fa Spring
	
	@GetMapping("alumnes/{id}")
	public Alumne getAlumne(@PathVariable long id) {
		
		return alumeRepo.findById(id).get();
	}
	
	@GetMapping("alumnes")
	public Iterable<Alumne> getAlumnes() {
		
		return alumeRepo.findAll();
	}
	
	@PostMapping("alumnes")
	public Alumne altaClient(@RequestBody Alumne alumne) {
		
		alumeRepo.save(alumne);
		
		return alumne;
	}
	
	
	@DeleteMapping("alumnes/{id}")
    public ResponseEntity<Alumne>  deleteAlumne(@PathVariable Long id) {
        alumeRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
	
	//@PatchMapping("alumnes/{id}")
	//public ResponseEntity<Alumne> patchAlumne(@PathVariable Long id){
		//alumeRepo.patchById(id);
		//alumeRepo.save(id);
		//return ResponseEntity.noContent().build();
	//}
	
	//@DeleteMapping("clients/{id}")
	
	//@PutMapping("clients")


}