package net.jaumebalmes.m12.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.m12.objectes.UFs;

@RestController
public class ControladorUnitatsFormatives {
	
	@GetMapping("unitatsFormatives")
	public ArrayList<UFs> getUnitatsFormatives() {
		ArrayList<UFs> unitatsFormatives = new ArrayList<>();
		
		unitatsFormatives.add(new UFs("Projecte de desenvolupament d'aplicacions web",1));
		unitatsFormatives.add(new UFs("Projecte de desenvolupament d'aplicacions web2",2));
		unitatsFormatives.add(new UFs("Projecte de desenvolupament d'aplicacions web3",3));
		
		return unitatsFormatives;
	}
	
	@GetMapping("unitatFormativa/{idUF}")
	public UFs getUnitatFormativa(@PathVariable int idUF) {
		ArrayList<UFs> unitatFormativa = new ArrayList<>();
		
		unitatFormativa.add(new UFs("Projecte de desenvolupament d'aplicacions web",1));
		unitatFormativa.add(new UFs("Projecte de desenvolupament d'aplicacions web2",2));
		unitatFormativa.add(new UFs("Projecte de desenvolupament d'aplicacions web3",3));
		
		return unitatFormativa.get(idUF -1);
	}
	
}
