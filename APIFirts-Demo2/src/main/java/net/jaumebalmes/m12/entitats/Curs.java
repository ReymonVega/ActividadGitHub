package net.jaumebalmes.m12.entitats;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String cicle;
    private String grup;
    private int aula;   
    private int curs;    

    public Curs(long id, String cicle, String grup, int aula, int curs) {
    	super();
    	this.id = id;
        this.cicle = cicle;
        this.grup = grup;
        this.aula = aula;
        this.curs = curs;
    }
    
    public Curs() {
    	super();
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

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

	@Override
	public String toString() {
		return "Curs [id=" + id + ", cicle=" + cicle + ", grup=" + grup + ", aula=" + aula + ", curs=" + curs + "]";
	}
    
    
}

