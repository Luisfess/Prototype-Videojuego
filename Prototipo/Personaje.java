package Prototipo;

public interface Personaje {
    Personaje clone();
    void mostrarInfo();
    
    void setNombre(String nombre);
    String getNombre();

    void setNivel(int nivel);
    int getNivel();

    void setArma(String arma);
    String getArma();
}