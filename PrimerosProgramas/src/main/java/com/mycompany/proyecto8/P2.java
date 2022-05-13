
package com.mycompany.proyecto8;

import java.util.Scanner;

public class P2 {
   public static void main(String[] args) {
        String User[] = {"Daiana","Facundo","Osvaldo","Melina"};
        int pass[] = {1234,4321,1122,3344};
        Scanner Leer = new Scanner(System.in);
        Scanner LeerN=new Scanner(System.in);

        boolean bandera=true;

        while (bandera==true){
            
            System.out.println("Ingrese su Nombre");
            String Nombre = Leer.nextLine();
            System.out.println("Ingrese su Contraseña");
            int contraseña = LeerN.nextInt();
            
            for (int i = 0; i < User.length; i++) {
                
                if(User[i].equals(Nombre)){
                    
                    if (Nombre.equals(User[i]) && contraseña == pass[i]) {
                        
                        System.out.println("Felicidades te doy la bienvenida "+Nombre);
                        System.out.println("¿Desea cambiar de contraseña?");
                        System.out.println("1_Si");
                        System.out.println("2_No");
                        
                        int cambiar = Leer.nextInt();
                        int res;

                        if (cambiar == 1) {
                            do{       
                                System.out.println("ingrese su nueva contraseña");
                                int NewCont = Leer.nextInt();
                                System.out.println("Su cotraseña ha sido cabiada correctamente");
                                System.out.println("prsione 2 para salir");       
                                res=Leer.nextInt();  
                            }while (res!=2);               
                        }          

                        if (cambiar == 2) {
                            System.out.println("Fin del programa");
                        }

                        bandera=false;
                        break;
                        
                        } else if(!Nombre.equals(User[i])) {
                            System.out.println("El usuario no corresponde");
                            bandera = true;


                        }else if (contraseña != pass[i]) {
                            System.out.println("La contraseña ingresada no es correcta");
                            bandera = true;
                        }
                }
            }
        }
    }
}

