
package com.mycompany.casting;

public class Casting {
    public static void main(String[] args) {
        
        Escuela e1 = new Escuela("Ies",1);
        
        Grado gradocast = (Grado) e1;
        
        System.out.println(gradocast.toString());
    }
}
