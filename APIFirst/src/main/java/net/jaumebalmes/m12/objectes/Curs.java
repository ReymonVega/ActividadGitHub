package net.jaumebalmes.m12.objectes;

public class Curs {
	 	private String cicle;
	    private String grup;
	    private int aula;   
	    private int curs;    

	    public Curs(String cicle, String grup, int aula, int curs) {

	        this.cicle = cicle;
	        this.grup = grup;
	        this.aula = aula;
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
}
