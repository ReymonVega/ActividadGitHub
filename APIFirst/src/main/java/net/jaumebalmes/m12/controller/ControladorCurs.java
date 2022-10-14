package net.jaumebalmes.m12.controller;

import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.m12.objectes.Curs;

@RestController
public class ControladorCurs {
	
    @GetMapping("Cursn")
    public List<Curs> getCurs() {
        ArrayList<Curs> cursos = new ArrayList<>();
        
        cursos.add(new Curs("DAW","DAW1",45,1));
        cursos.add(new Curs("DAM","DAM2",47,2));
        cursos.add(new Curs("ASIX","ASIX1",25,1));
        cursos.add(new Curs("DAW","DAW2",11,2));
        cursos.add(new Curs("DAM","DAM1",22,1));
        cursos.add(new Curs("ASIX","ASIX2",35,2));

        return cursos;

    }
}

