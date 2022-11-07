/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier2;

/**
 *
 * @author Ruben Gonzalez Sabina
 */
public class practica27 {

    /*
    Práctica 27: Hacer un programa que muestre la tabla de multiplicar del número 5 usando
un bucle while
     */
    public static void main(String[] args) {

        int i = 1;
        int resultado;
        int tabla = 5;
        while (i <= 10) {
            resultado = 5 * i;
            System.out.println(" " + 5 + " * " + i + " = " + resultado);
            i = i + 1;
        }

    }

}
