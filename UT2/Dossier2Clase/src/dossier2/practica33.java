/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier2;

import java.util.Scanner;

/**
 *
 * @author Ruben Gonzalez Sabina
 */
public class practica33 {

    /*
    Práctica 33: Se pretende imitar el comportamiento de un sistema de control por pin. El
usuario tiene 3 intentos para acertar con el pin, cada vez de esos tres intentos que falle se le
informa y se le dice el número de intentos que le queda. Si acierta se le muestra un mensaje
que diga: “El código es correcto. Bienvenido” Si no acierta en los tres intentos el programa
termina
Hacer 3 versiones de este código una con while, otra con do while y finalmente for
     */
    //BUCLE WHILE
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int intento, pin = 1324, veces = 0;
        while (veces < 3) {
            System.out.println("Ingresa el PIN: ");
            intento = entrada.nextInt();
            if (intento == pin) {
                System.out.println("El codigo es correcto. Bienvenido");
                veces = 3;
            } else {
                System.out.println("PIN erroneo");
                veces = veces + 1;
                if (veces == 3) {
                    System.out.println("Se han acabado los intentos");
                }
            }
        }
    }

    /*

        //BUCLE DOWHILE
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intento, pin = 1324, veces = 0;
        do{
            System.out.println("Ingresa el PIN: ");
            intento = sc.nextInt();
            if(intento == pin){
                System.out.println("El codigo es correcto. Bienvenido");
                veces = 3;
            }else{
                System.out.println("PIN erroneo");
                veces = veces + 1;
                if(veces == 3){
                    System.out.println("Se han acabado los intentos");
                }
            }
        }while(veces < 3);
    }
    
    
    /*
    
        //BUCLE FOR
    
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int intento, pin = 1324, veces = 0;

        for (veces = 0; veces < 3; veces++) {
            System.out.println("Ingresa el PIN: ");
            intento = sc.nextInt();
            if (intento == pin) {
                System.out.println("El codigo es correcto. Bienvenido");
                veces = 3;
            } else {
                System.out.println("PIN erroneo");

                System.out.println("Le quedan " + (2 - veces) + " intentos");
            }
        }

    }
   
     */
}
