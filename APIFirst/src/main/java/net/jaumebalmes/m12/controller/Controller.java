package net.jaumebalmes.m12.controller;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.m12.objectes.Alumne;
import net.jaumebalmes.m12.objectes.Moduls;

@RestController
public class Controller {
	
	
	//PartSebastianCasco
	@GetMapping("alumnes")
	public Alumne getAlumne() {
		Alumne Alumnes = new Alumne("Javier","Corona Alba",LocalDate.of(2000,Month.MAY, 17),"Jaume Balmes",2);
		return Alumnes;
	}
	
	//Part ReymonVega
	
	@GetMapping("modulos")
	public Moduls getModuls() {
		Moduls Modulos = new Moduls("UF1. Projecte de desenvolupament d'aplicacions web", 96);
		return Modulos;
	}
}
