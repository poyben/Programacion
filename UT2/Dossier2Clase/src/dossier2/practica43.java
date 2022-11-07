/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ruben Gonzalez Sabina
 */
public class practica43 {

    /*
    Práctica 43: Escribir un programa donde se genera un número secreto mayor o igual a 1 y
menor o igual a 99 El jugador intentará acertar el número si se equivoca el programa le
informa de si el número secreto es mayor o menor que el que él ha introducido. El
programa finaliza cuando el jugador acierte en cuyo caso se le mostrará elnúmero de
intentos que ha necesitado para acertar.
Nota: se puede utilizar Random para el número aleatorio:
Random rnd = new Random();
rnd.nextInt(30); //genera un aleatorio desde 0 hasta 29
     */
    public static void main(String[] args) {

        int secreto;

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int numSecreto = 1 + rnd.nextInt(99);
        int limInf, limSup;

        boolean acierto = false;
        int contador = 0;
        while (acierto == false) {
            System.out.println("Dime un numero");
            int num = sc.nextInt();
            contador++;

            if (num > numSecreto) {
                System.out.println("El numero secreto es menor al introducido");
            } else if (num < numSecreto) {
                System.out.println("El numero secreto es mayor al introducido");

            } else {
                System.out.println("Has acertado");
                System.out.println("Has necesitado " + contador + " intentos");

            }

        }
    }

}
