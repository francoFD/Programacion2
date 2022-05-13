
package com.mycompany.proyecto8;

import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        String vector[]= new String [4];
        
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Ingrese 4 frases a continuacion");
        for(int i=0; i<vector.length; i++){
            String Frase;
            Frase=Leer.nextLine();
            vector[i]= Frase;
        }
        for(int i=0; i<vector.length; i++){
        System.out.println("  "+vector[i]);
        }
    }
}
