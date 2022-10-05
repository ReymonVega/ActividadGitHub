package net.jaumebalmes.m12.objectes;
import java.time.LocalDate;
public class Alumne {
	 
		    private String nom;
		    private String cognoms;
		    private LocalDate dataNaixement;
		    private String centre;
		    private int curs;
		    
		    public Alumne(String nom, String cognoms, LocalDate dataNaixement, String centre, int curs) {
		    	super();
		    	this.nom = nom;
		    	this.cognoms = cognoms;
		    	this.dataNaixement = dataNaixement;
		    	this.centre = centre;
		    	this.curs = curs;
		    }
		    
		    public String getNom(){
		        return nom; 
		    }
		    
		    public void setNom(String nom){
		        this.nom = nom;
		    }
		    
		    public String getCognoms(){
		        return cognoms;
		    }
		    
		    public void  setCognoms(String cognoms){
		        this.cognoms = cognoms;
		    }

		    public LocalDate getDataNaixement(){
		        return dataNaixement;
		    }

		    public void setDataNaixement(LocalDate dataNaixement){
		        this.dataNaixement = dataNaixement;
		    }

		    public String getCentre(){
		        return centre; 
		    }

		    public void setCentre(String centre){
		        this.centre = centre;
		    }

		    public int getCurs(int curs){
		        return curs;
		    }

		    public void setCurs(){
		        this.curs = curs;
		    }
}
