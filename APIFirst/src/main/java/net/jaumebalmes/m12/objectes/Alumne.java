package net.jaumebalmes.m12.objectes;
import java.time.LocalDate;
public class Alumne {
	 
	 private String nom;
	 private String cognoms;
	 private LocalDate dataNaixement;
	 private String email;
	 private String cicle;
	 private String grup;
	 private int curs;
	 
	 public Alumne(String nom, String cognoms, LocalDate dataNaixement, String email, String cicle, String grup,
			int curs) {
		super();
		this.nom = nom;
		this.cognoms = cognoms;
		this.dataNaixement = dataNaixement;
		this.email = email;
		this.cicle = cicle;
		this.grup = grup;
		this.curs = curs;
	}

	public Alumne(String nom, String cognoms, LocalDate dataNaixement, String email, int curs) {
		super();
		this.nom = nom;
		this.cognoms = cognoms;
		this.dataNaixement = dataNaixement;
		this.email = email;
		this.curs = curs;
	}
	
	public Alumne() {
		
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

	public LocalDate getDataNaixement() {
		return dataNaixement;
	}

	public void setDataNaixement(LocalDate dataNaixement) {
		this.dataNaixement = dataNaixement;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCurs() {
		return curs;
	}

	public void setCurs(int curs) {
		this.curs = curs;
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
	 
}
