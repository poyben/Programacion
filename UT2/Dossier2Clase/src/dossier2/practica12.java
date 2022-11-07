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
public class practica12 {

    /*
    Práctica 12: Se tienen tres variables, a, b y c. Escribe las asignaciones necesarias para
intercambiar sus valores, sean cuales sean, de manera que:
b tome el valor de a
c tome el valor de b
a tome el valor de c
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor de a");
        int a = sc.nextInt();
        int auxiliar = a;
        System.out.println("Introduce el valor de b");
        int b = sc.nextInt();
        System.out.println("Introduce el valor de c");
        int c = sc.nextInt();

        a = c;
        c = b;
        b = auxiliar;

        System.out.println("El nuevo valor de a es:" + a);
        System.out.println("El nuevo valor de b es:" + b);
        System.out.println("El nuevo valor de c es:" + c);

    }

}
