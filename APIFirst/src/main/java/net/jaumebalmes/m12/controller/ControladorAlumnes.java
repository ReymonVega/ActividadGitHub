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
	
	@GetMapping("alumnes")
	public List<Alumne> getAlumnes(){
		ArrayList<Alumne> alumnes = new ArrayList<>();

		alumnes.add(new Alumne("Javier","Corona Alba",LocalDate.of(2000,Month.MAY, 17),"Jaume Balmes","DAW2"));
		alumnes.add(new Alumne("Roger","Sobrino Gil",LocalDate.of(2000,Month.MAY, 26),"Jaume Balmes","DAW2"));
		alumnes.add(new Alumne("Gerard","Martinez Perez",LocalDate.of(2000,Month.MAY, 26),"Jaume Balmes","DAW2"));
		alumnes.add(new Alumne("Xavi","Casco Lopez",LocalDate.of(2000,Month.MAY, 26),"Jaume Balmes","DAW2"));
		alumnes.add(new Alumne("Miquel","Alvarez Redondo",LocalDate.of(2000,Month.MAY, 26),"Jaume Balmes","DAW2"));
		
		return alumnes;
	}
	
	@GetMapping("alumnes/{idAlumne}")
	public Alumne getAlumne(@PathVariable int idAlumne) {
		ArrayList<Alumne> alumnes = new ArrayList<>();

		alumnes.add(new Alumne("Javier","Corona Alba",LocalDate.of(2000,Month.MAY, 17),"Jaume Balmes","DAW2"));
		alumnes.add(new Alumne("Roger","Sobrino Gil",LocalDate.of(2000,Month.MAY, 26),"Jaume Balmes","DAW2"));
		alumnes.add(new Alumne("Gerard","Martinez Perez",LocalDate.of(2000,Month.MAY, 26),"Jaume Balmes","DAW2"));
		alumnes.add(new Alumne("Xavi","Casco Lopez",LocalDate.of(2000,Month.MAY, 26),"Jaume Balmes","DAW2"));
		alumnes.add(new Alumne("Miquel","Alvarez Redondo",LocalDate.of(2000,Month.MAY, 26),"Jaume Balmes","DAW2"));
		
		return alumnes.get(idAlumne -1);
	}
	
}
