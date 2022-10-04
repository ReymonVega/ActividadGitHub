package net.jaumebalmes.m12.controller;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.m12.objectes.Alumne;

@RestController
public class Controller {
	
	@GetMapping("alumnes")
	public Alumne getAlumne() {
		Alumne Alumnes = new Alumne("Javier","Corona Alba",LocalDate.of(2000,Month.MAY, 17),"Jaume Balmes",2);
		return Alumnes;
	}
}
