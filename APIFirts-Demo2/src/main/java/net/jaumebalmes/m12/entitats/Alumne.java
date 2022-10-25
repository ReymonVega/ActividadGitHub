package net.jaumebalmes.m12.entitats;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //taula de la BD
public class Alumne {
	
	
	@Id // clau a la taula de la BD
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nom;
	private String cognoms;
	private LocalDate data;
	private String email;
	private String cicle;
	private String grup;
	private int curs;

	public Alumne(long id, String nom, String cognoms, LocalDate data, String email, String cicle, String grup,
			int curs) {
		super();
		this.id = id;
		this.nom = nom;
		this.cognoms = cognoms;
		this.data = data;
		this.email = email;
		this.cicle = cicle;
		this.grup = grup;
		this.curs = curs;
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognoms() {
		return cognoms;
	}

	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}

	public LocalDate getdata() {
		return data;
	}

	public void setDataNaixement(LocalDate data) {
		this.data = data;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCicle() {
		return cicle;
	}

	public void setCicle(String cicle) {
		this.cicle = cicle;
	}

	public String getGrup() {
		return grup;
	}

	public void setGrup(String grup) {
		this.grup = grup;
	}

	public int getCurs() {
		return curs;
	}

	public void setCurs(int curs) {
		this.curs = curs;
	}

	@Override
	public String toString() {
		return "Alumne [id=" + id + ", nom=" + nom + ", cognoms=" + cognoms + ", dataNaixement=" + data
				+ ", email=" + email + ", cicle=" + cicle + ", grup=" + grup + ", curs=" + curs + "]";
	}
	
}
