
package com.mycompany.casting;

public class Escuela {
    private String Nombre;
    private int Nivel;

    public Escuela(String Nombre, int Nivel) {
        this.Nombre = Nombre;
        this.Nivel = Nivel;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    @Override
    public String toString() {
        return "Grado\n" + 
               "\n Nombre =" + Nombre + 
               "\n Nivel=" + Nivel;
    }
}
