package PrototiposConcretos;
import Prototipo.Personaje;

public class Arquero implements Personaje {
    private String nombre;
    private int nivel;
    private String arco;

    public Arquero(String nombre, int nivel, String arco) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.arco = arco;
    }

    public Arquero(Arquero prototipo) {
        this.nombre = prototipo.nombre;
        this.nivel = prototipo.nivel;
        this.arco = prototipo.arco;
    }

    @Override
    public Personaje clone() {
        return new Arquero(this);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Arquero: " + nombre + ", Nivel: " + nivel + ", Arco: " + arco);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setArco(String arco) {
        this.arco = arco;
    }

    @Override
    public void setArma(String arma) {
        this.arco = arma;
    }
    @Override
    public String getArma() {   
        return this.arco;
    }
    
}