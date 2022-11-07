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
public class practica23 {

    /*
    Práctica 23: Hacer un programa que resuelva ecuaciones de segundo grado. El usuario
introduce los valores de a,b,c de la fórmula: aX^2+bX+c = 0
Se debe mostrar las dos posibles soluciones, salvo que haya una raiz negativa en cuyo caso
se mostrará el mensaje: “no hay solución real”
Nota. Para resolver podemos hacer uso de: Math.sqrt() para obtener la raíz cuadrada
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de a");
        double numa = sc.nextInt();

        System.out.println("Introduce el valor de b");
        double numb = sc.nextInt();

        System.out.println("Introduce el valor de c");
        double numc = sc.nextInt();

        double dentroRaiz = numb * numb - (4 * numa * numc);

        if (dentroRaiz < 0) {
            System.out.println("No hay solucion real");
        } else {
            System.out.println("Solucion1 = " + (-numb + Math.sqrt(dentroRaiz)) / (2 * numa));
            System.out.println("Solucion2 = " + (-numb - Math.sqrt(dentroRaiz)) / (2 * numa));
        }

    }

}
