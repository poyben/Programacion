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
public class practica17 {

    /*
    Práctica 17: Crea un programa que calcule el IGIC (7%) de un producto dado su precio de
venta sin IGIC que introduzca el usuario por teclado.
     */
    public static void main(String[] args) {

        System.out.println("Introduce el precio de un producto sin IGIC");
        Scanner sc = new Scanner(System.in);
        double precioSinIGIC = sc.nextDouble();

        double igic = precioSinIGIC * 0.07;

        System.out.println("El IGIC correspondiente a ese producto es de " + igic + " euros");
    }

}
