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
public class practica22 {

    /*
    Práctica 22: Hacer un programa que haga uso de estructuras if else if para que dado un
número entero x muestre en pantalla:
- x es menor de 0
- x es igual a 0
- x es mayor que 0 y menor que 10
- x es igual a 10
- x es mayor que 10 y menor que 20
- x es mayor o igual a 20
     */
    public static void main(String[] args) {

        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        int numUsuario = sc.nextInt();

        if (numUsuario < 0) {
            System.out.println(numUsuario + " es menor que 0");
        } else if (numUsuario == 0) {
            System.out.println(numUsuario + " es igual a 0");
        } else if (numUsuario > 0 && numUsuario < 10) {
            System.out.println(numUsuario + " es mayor que 0 y menor que 10");
        } else if (numUsuario == 10) {
            System.out.println(numUsuario + " es igual a 10");
        } else if (numUsuario > 10 && numUsuario < 20) {
            System.out.println(numUsuario + " es mayor que 10 y menor que 20");
        } else {
            System.out.println(numUsuario + " es mayor o igual a 20");
        }

    }

}
