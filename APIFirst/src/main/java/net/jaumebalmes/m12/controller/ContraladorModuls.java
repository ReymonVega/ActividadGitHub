package net.jaumebalmes.m12.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import net.jaumebalmes.m12.objectes.Moduls;

public class ContraladorModuls {
	
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
