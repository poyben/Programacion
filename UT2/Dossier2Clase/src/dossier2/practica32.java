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
public class practica32 {

    /*
    Práctica 32: Hacer un programa que reciba dos números enteros positivos del usuario y
muestre la suma de todos los números que hay entre esos dos números.
Ej. Usuario introduce: 10, 5 entonces la secuencia de números es:
5,6,7,8,9,10
y la suma de esos números es:
45
Hacer uso de un bucle for para este programa
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1, numero2, menor, mayor, i, suma = 0;

        do {

            System.out.println("Escribe un numero");
            numero1 = sc.nextInt();
            System.out.println("Escribe otro numero");
            numero2 = sc.nextInt();

            if (numero1 == numero2) {
                System.out.println("Debes introducir dos números distintos");
            }
        } while (numero1 == numero2);

        if (numero1 > numero2) {
            mayor = numero1;
            menor = numero2;
        } else {
            mayor = numero2;
            menor = numero1;
        }
        for (i = menor; i <= mayor; i++) {
            System.out.println(i);

        }
        suma = ((mayor + menor) * (mayor + 1 - menor)) / 2;
        System.out.println(suma);
    }
}
