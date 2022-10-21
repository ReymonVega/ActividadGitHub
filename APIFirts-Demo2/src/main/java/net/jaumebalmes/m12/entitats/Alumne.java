package net.jaumebalmes.m12.entitats;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //taula de la BD
public class Alumne {
	
	
	@Id // clau a la taula de la BD
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nomAlumne;
	private String cognomAlumne;
	private LocalDate data;
	
	public Alumne(String nomAlumne, String cognomAlumne, LocalDate data) {
		super();
		this.id = id;
		this.nomAlumne = nomAlumne;
		this.cognomAlumne = cognomAlumne;
		this.data = data;
	}

	public Alumne() {
		super();
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNomAlumne() {
		return nomAlumne;
	}
	
	public void setNomAlumne(String nomAlumne) {
		this.nomAlumne = nomAlumne;
	}
	
	public String getCognomAlumne() {
		return cognomAlumne;
	}
	
	public void setCognomAlumne(String cognomAlumne) {
		this.cognomAlumne = cognomAlumne;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setDate(LocalDate data) {
		this.data =  data;
	}

	@Override
	public String toString() {
		return "Alumne [id=" + id + ", nomAlumne=" + nomAlumne + ", cognomAlumne=" + cognomAlumne + ", data=" + data
				+ "]";
	}
	
	
	
	
}