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
public class practica13 {

    /*
    Práctica 13: Sea el siguiente programa:
public static void main(String[] args) {
Scanner cin = new Scanner(System.in);
System.out.println("Introduzca un número mayor que 5 ");
int numero = cin.nextInt();
boolean comparaCon5;
comparaCon5 = numero > 5;
System.out.println("Es " + comparaCon5 + " que el número sea mayor que 5");
}
Ejecutarlo e introducir un número mayor que 5 ¿ qué mensaje muestra ? Ahora introduce un
número menor que 5 ¿ qué mensaje muestra ahora ?.
     */
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Introduzca un número mayor que 5 ");
        int numero = cin.nextInt();
        boolean comparaCon5;
        comparaCon5 = numero > 5;
        System.out.println("Es " + comparaCon5 + " que el número sea mayor que 5");

    }
    //Si introduces un numero mayor te dice que es verdad que el numero es mayor que 5.
    //Si introduces un numero menor que cinco, te dice que es falso que sea mayor que 5.
}
