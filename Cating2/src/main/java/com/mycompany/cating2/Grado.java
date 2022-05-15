
package com.mycompany.cating2;

public class Grado extends Escuela{
    private String Nom;
    private int cantAlum;

    public Grado(){
    }

    public Grado(String Nom, int cantAlum) {
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
    //Metodo toString
    @Override
    public String toString() {
        return "Grado\n" + 
               "\n Nom= " + Nom + 
               "\n cantAlum=" + cantAlum;
    }
    //Comparacion de objetos con el metodo equals
    @Override
    public boolean equals(Object obj) {
       return obj.equals(toString());
    }   
}
