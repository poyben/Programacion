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
public class practica41 {

    /*
    Práctica 41: Escribir un programa que el usuario escriba una cadena de texto y se le
muestre el texto al revés. Ej “cabello” mostraría: “ollebac”
Nota: “cabello”.substring(2,3) devuelve: “b” que es la tercera letra de ese texto
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        //texto = sc.nextLine();
        texto = "cabello";
        String resultado = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            String str = texto.substring(i, i + 1);
            resultado += str;

            System.out.println(resultado);

        }
    }
}
