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
public class practica40 {

    /*
    Práctica 40: Escribir un programa que reciba un número entero mayor o igual a 0 y menor
o igual a 999 y muestre cuántas cifras tiene
     */
    public static void main(String[] agrs) {
        int cifras = 0, num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numero entre el 0 y el 999");
        num = sc.nextInt();
        if (num <= 999 && num >= 0) {
            cifras = 0;    //esta variable es el contador de cifras
            while (num != 0) {             //mientras a n le queden cifras
                num = num / 10;         //le quitamos el último dígito
                cifras++;
            }
            System.out.println("El numero tiene: " + cifras + " cifra/s");
        } else {
            System.out.println("Numero no valido");

            //CONTINUAR
        }
    }
}
