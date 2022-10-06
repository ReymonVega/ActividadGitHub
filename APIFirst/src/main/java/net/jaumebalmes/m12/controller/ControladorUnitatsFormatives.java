package net.jaumebalmes.m12.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;

import net.jaumebalmes.m12.objectes.UFs;

public class ControladorUnitatsFormatives {
	
	@GetMapping("unitatsFormatives")
	public ArrayList<UFs> getUnitatsFormatives() {
		ArrayList<UFs> unitatsFormatives = new ArrayList<>();
		
		unitatsFormatives.add(new UFs("Projecte de desenvolupament d'aplicacions web",1));
		unitatsFormatives.add(new UFs("Projecte de desenvolupament d'aplicacions web2",2));
		unitatsFormatives.add(new UFs("Projecte de desenvolupament d'aplicacions web3",3));
		
		return unitatsFormatives;
	}
	
	@GetMapping("unitatFormativa")
	public ArrayList<UFs> getUnitatFormativa() {
		ArrayList<UFs> unitatsFormativa = new ArrayList<>();
		
		unitatsFormativa.add(new UFs("Projecte de desenvolupament d'aplicacions web",1));
		unitatsFormativa.add(new UFs("Projecte de desenvolupament d'aplicacions web2",2));
		unitatsFormativa.add(new UFs("Projecte de desenvolupament d'aplicacions web3",3));
		
		return unitatsFormativa;
	}
	
}
