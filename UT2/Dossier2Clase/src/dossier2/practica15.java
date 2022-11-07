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
public class practica15 {

    /*
    Práctica 15: Hacer un programa que lea una línea de texto entrada por teclado y la muestre
en pantalla
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        System.out.println("Tu texto es: " + texto);

    }

}
