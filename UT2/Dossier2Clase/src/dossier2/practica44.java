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
public class practica44 {

    /*
    Práctica 44: Programa generador de potencias. El usuario introduce un número entero de 1
a 20. Se le mostrará en pantalla las 5 primeras potencias de ese número.
Ej. número introducido 2
2^1 = 2
2^2 = 4
2^3 = 8
2^4 = 16
2^5 = 32
     */
    public static void main(String[] args) {

        System.out.println("INtroduce un numero del 1 al 20");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int resultado = 1;
        for (int i = 1; i < 6; i++) {
            resultado *= numero;
            System.out.println(numero + "^" + i + "=" + resultado);
        }

    }

}
