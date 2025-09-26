package PrototiposConcretos;
import Prototipo.Personaje;

public class Guerrero implements Personaje {
    private String nombre;
    private int nivel;
    private String arma;

    public Guerrero(String nombre, int nivel, String arma) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.arma = arma;
    }

    public Guerrero(Guerrero prototipo) {
        this.nombre = prototipo.nombre;
        this.nivel = prototipo.nivel;
        this.arma = prototipo.arma;
    }

    @Override
    public Personaje clone() {
        return new Guerrero(this);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public String getArma() {
        return arma;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Guerrero: " + nombre + ", Nivel: " + nivel + ", Arma: " + arma);
    }
}