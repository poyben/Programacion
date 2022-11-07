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
public class practica28 {

    /*
    Práctica 28 Hacer un programa que el usuario vaya introduciendo números enteros. El
programa finaliza cuando el usuario introduce el número 0. En ese momento se le muestra
la suma total de los números positivos y la suma total de los números negativos
     */
    public static void main(String[] args) {

        int num, suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num = sc.nextInt();
        while (num != 0) {
            suma = suma + num;
            System.out.println("Introduce un numero");
            num = sc.nextInt();
        }
        System.out.println("La suma de los numeros es: " + suma);

    }
}
