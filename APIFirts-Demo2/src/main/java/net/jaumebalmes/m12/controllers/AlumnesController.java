package net.jaumebalmes.m12.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.m12.entitats.Alumne;
import net.jaumebalmes.m12.repos.AlumnesRepository;


@RestController
@RequestMapping("api")
public class AlumnesController {
	
	AlumnesRepository alumneRep;
	
	@GetMapping("alumnes/{id}")
	public Alumne getAlumne(@PathVariable long id) {
		Alumne alumne = alumneRep.findById(id).get();
		return alumne;
	}
	
	
	
}
