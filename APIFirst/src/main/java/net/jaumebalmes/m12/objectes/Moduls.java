package net.jaumebalmes.m12.objectes;


public class Moduls {
    private String nombreDelModul;
    private int duracion;
    private String ufsModuls ;

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

    public String getUfsModuls() {
        return ufsModuls;
    }

    public void setUfsModuls(String ufsModuls) {
        this.ufsModuls = ufsModuls;
    }

    //Constructor

    public Moduls(String nombreDelModul, int duracion, String ufsModuls) {
        this.nombreDelModul = nombreDelModul;
        this.duracion = duracion;
        this.ufsModuls = ufsModuls;
    }
    
    

}