package net.jaumebalmes.m12.controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public List<Moduls> getModuls(){
		
		List <Moduls> listaModuls = new ArrayList<>();
		
		listaModuls.add( new Moduls("UF1 Servidors Web i transferència de fitxers", 57 , "25%" ));
		listaModuls.add( new Moduls("UF1. Projecte de desenvolupament d'aplicacions web", 62 ,"40%"));
		listaModuls.add( new Moduls("UF01 Disseny de la interfície. Estils.", 45 ,"35%"));
		return listaModuls;
		
		
	}
	
	@GetMapping("modulos/{nModuls}")
	
	public Moduls getModuls(@PathVariable int nModuls) {
		
		List<Moduls> listaModuls = new ArrayList<>();
		
		listaModuls.add( new Moduls("UF1 Servidors Web i transferència de fitxers", 57 , "25%" ));
		listaModuls.add( new Moduls("UF1. Projecte de desenvolupament d'aplicacions web", 62 ,"40%"));
		listaModuls.add( new Moduls("UF01 Disseny de la interfície. Estils.", 45 ,"35%"));
		
		return listaModuls.get(nModuls -1);
	}
}
