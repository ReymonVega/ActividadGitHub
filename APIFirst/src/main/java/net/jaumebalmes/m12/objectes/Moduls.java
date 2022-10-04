package net.jaumebalmes.m12.objectes;


public class Moduls {
    private String nombreDelModul;
    private int duracion;

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
    
    //Constructor
    public Moduls(String nombreDelModul, int duracion ) {
        this.nombreDelModul = nombreDelModul;
        this.duracion = duracion;
    }
    
    

}