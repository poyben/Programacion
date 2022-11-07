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
public class practica19 {

    /*
    Práctica 19: Realizar un programa que sirva para convertir grados Farenheit en centígrados
El usuario introducirá los grados Farenheit y se le mostrará la equivalencia en centígrados.
La fórmula es:.
C = ( F – 32 ) * 5/9
donde C es grados centígrados y F es Farenheit
     */
    public static void main(String[] args) {

        System.out.println("Introduce los grados Farenheit a convertir");

        Scanner sc = new Scanner(System.in);

        double gradosFar = sc.nextDouble();

        double gradosCen = (gradosFar - 32) * 5 / 9;

        System.out.println("Los grados centigrados correspondientes son: " + gradosCen + "º");
    }

}
