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
public class practica45 {

    /*
    Práctica 45: Crear un programa que reciba un número entero y que muestre su
descomposición en números primos:
300 = 2*2*3*5*5
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int divisor = 2;
        System.out.print("Introduce un numero: ");
        num = sc.nextInt();
        while (num != 1) {
            if (num % divisor == 0) {
                System.out.print(divisor + " ");
                num = num / divisor;
            } else {
                divisor++;
            }
        }
    }
}
