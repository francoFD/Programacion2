
package com.mycompany.casting;

public class Grado extends Escuela{
    private String Nom;
    private int cantAlum;

    public Grado(String Nom, int cantAlum, String Nombre, int Nivel) {
        super(Nombre, Nivel);
        this.Nom = Nom;
        this.cantAlum = cantAlum;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public int getCantAlum() {
        return cantAlum;
    }

    public void setCantAlum(int cantAlum) {
        this.cantAlum = cantAlum;
    }

    @Override
    public String toString() {
        return "Grado\n" + 
               "\n Nom= " + Nom + 
               "\n cantAlum=" + cantAlum;
    }
}
