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
public class practica24 {

    /*
    Práctica 24: Hacer un programa que le pregunte al usuario su idioma preferido. Donde la
letra ‘c’ será castellano, ‘i’ inglés, ‘f’ francés. Según la opción que haya elegido se le
mostrará respectivamente: “Buenos días”, “Good morning”, “Bonjour” y termina. Si el
usuario escribe cualquier otra cosa el programa mostrara: “no entiendo tu idioma” y termina
Tener en cuenta que Scanner no tiene un método nextChar() en su defecto usar:
next().charAt(0) que va a tomar el primer carácter de la línea de texto introducida
Ej.
Scanner cin = new Scanner(System.in);
char c = cin.next().charAt(0);
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char idioma = sc.next().charAt(0);
        switch (idioma) {
            case 'c':
                System.out.println("Buenos dias");
                break;
            case 'i':
                System.out.println("Good morning");
                break;
            case 'f':
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("No entiendo tu idioma");
        }

    }

}
