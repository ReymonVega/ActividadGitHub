package net.jaumebalmes.m12.objectes;


public class Moduls {
    private String nombreDelModul;
    private int duracion;
    private String asistenciaModuls;

    public String getNombreDelModul() {
        return nombreDelModul;
    }

    public void setNombreDelModul(String nombreDelModul) {
        this.nombreDelModul = nombreDelModul;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public String getAsistenciaModuls(){
        return asistenciaModuls;
    }

    public void setAsistenciaModuls(String asistenciaModuls) {
        this.asistenciaModuls = asistenciaModuls;
    }
    
    
    
    
    //Constructork
    public Moduls(String nombreDelModul, int duracion, String asistenciaModuls) {
        this.nombreDelModul = nombreDelModul;
        	this.duracion = duracion;
        		this.asistenciaModuls = asistenciaModuls;
    }
    
    

}