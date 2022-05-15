
package com.mycompany.cating2;

public class Cating2 {

    public static void main(String[] args) {
        Grado grado1 = new Grado("PrimerAño", 30);
        Grado grado2 = new Grado("SegundoAño",20);
        Grado grado3 = new Grado("PrimerAño", 30);
        
        System.out.println("¿Los objetos son iguales? "+grado1.equals(grado2));
        System.out.println("¿Los objetos son iguales? "+grado1.equals(grado3));
    }
}
