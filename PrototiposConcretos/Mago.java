package PrototiposConcretos;
import Prototipo.Personaje;

public class Mago implements Personaje {
    private String nombre;
    private int nivel;
    private String hechizo;

    public Mago(String nombre, int nivel, String hechizo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.hechizo = hechizo;
    }

    public Mago(Mago prototipo) {
        this.nombre = prototipo.nombre;
        this.nivel = prototipo.nivel;
        this.hechizo = prototipo.hechizo;
    }

    @Override
    public Personaje clone() {
        return new Mago(this);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Mago: " + nombre + ", Nivel: " + nivel + ", Hechizo: " + hechizo);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public String getHechizo() {
        return hechizo;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setHechizo(String hechizo) {
        this.hechizo = hechizo;
    }

    @Override
    public void setArma(String arma) {
        this.hechizo = arma;
    }
    @Override
    public String getArma() {   
        return this.hechizo;
    }
    
}