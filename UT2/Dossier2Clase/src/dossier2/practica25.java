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
public class practica25 {

    /*
    Práctica 25: Hacer un programa que le pida al usuario que introduzca una letra y por
medio de una estructura switch, evitando el mayor número de sentencias break posibles ,
muestre en pantalla el mensaje: “es una vocal” cuando el usuario haya introducido una
vocal ( ya sea minúscula o mayúscula ) y el mensaje: “no es una vocal” si no lo fuera.
     */
    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una letra");

        char letra = sc.next().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("No es una vocal");
        }
    }

}
