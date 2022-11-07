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
public class practica21 {

    /*
    Práctica 21: Hacer un programa que se le pase un número entero y determine si es
múltiplo de 3 y de 5. Un módelo de mensajes a mostrar sería:
- x es multiplo de 3 pero no es múltiplo de 5
- x no es múltiplo de 3 pero sí es múltiplo de 5
- x no es múltiplo de 3 ni de 5
- x es múltiplo de 3 y de 5
     */
    public static void main(String[] args) {

        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        int numUsuario = sc.nextInt();

        if (numUsuario % 3 == 0) {
            if (numUsuario % 5 == 0) {
                System.out.println(numUsuario + " es multiplo de 3 y de 5");
            } else {
                System.out.println(numUsuario + " es multiplo de 3 pero no es multiplo de 5");
            }
        } else {
            if (numUsuario % 5 == 0) {
                System.out.println(numUsuario + " no es multiplo de 3 pero si de 5");
            } else {
                System.out.println(numUsuario + " no es multiplo de 3 ni de 5");
            }
        }

    }

}
