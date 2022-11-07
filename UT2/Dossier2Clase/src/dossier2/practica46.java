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
public class practica46 {

    /*
    onvertir un número a binario. El usuario introduce un número entero
decimal y el programa muestra en pantalla como es su forma en binario
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero para pasar a binario");
        int num = sc.nextInt();
        int division;
        String conversion = " ";

        while (num > 0) {

            division = num % 2;
            conversion = " " + division + conversion;

            num /= 2;

            System.out.println(conversion);

        }

    }

}
