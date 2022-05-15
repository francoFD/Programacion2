
package com.mycompany.cating2;

public class Escuela {
    private String Nombre;
    private int Nivel;

    public Escuela() {
    }
     
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
    //Metodo toString
    @Override
    public String toString() {
        return "Grado\n" + 
               "\n Nombre =" + Nombre + 
               "\n Nivel=" + Nivel;
    }
    //Comparacion de objetod con el metodo equals
    @Override
    public boolean equals(Object obj) {
       return obj.equals(toString());
    }
}
