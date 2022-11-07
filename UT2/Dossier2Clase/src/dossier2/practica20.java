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
public class practica20 {

    /*
    Práctica 20: Hacer un programa que se le pase un número entero y que devuelva los
siguientes mensajes:
- Si es impar: “El número: x es impar”
- Si es par: “El número x es par”
Donde x es el número introducido por el usuario
     */
    public static void main(String[] args) {

        System.out.println("Introduce un numero para saber si es par o no");

        Scanner sc = new Scanner(System.in);

        int numUsuario = sc.nextInt();

        if (numUsuario % 2 == 0) {
            System.out.println("El numero: " + numUsuario + " es par");
        } else {
            System.out.println("El numero: " + numUsuario + " es impar");

        }

    }
}
