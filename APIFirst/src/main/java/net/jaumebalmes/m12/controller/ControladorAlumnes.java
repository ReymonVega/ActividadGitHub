package net.jaumebalmes.m12.controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.m12.objectes.Alumne;

@RestController
public class ControladorAlumnes {
	
	@GetMapping("alumnes/{grup}")
	public ArrayList<Alumne> getAlumnesGrup(@PathVariable String grup) {
		ArrayList<Alumne> alumnes = new ArrayList<>();
		
		ArrayList<Alumne> resultat = new ArrayList<>();

		alumnes.add(new Alumne("Matias","Rodriguez Saldaña", LocalDate.of(2002, 11, 6),"mrodrigu@jaumebalmes.net","DAW","DAW2",2));
		alumnes.add(new Alumne("Matias","Rodriguez Saldaña", LocalDate.of(2002, 11, 6),"mrodrigu@jaumebalmes.net","ASIX","ASIX2",2));
		
		for (int i=0; i<alumnes.size();i++) {
			if(alumnes.get(i).getGrup().equals(grup)) {
				resultat.add(alumnes.get(i));
			}
		}
		return resultat;
	}
}
