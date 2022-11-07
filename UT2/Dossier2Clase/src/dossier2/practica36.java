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
public class practica36 {

    /*
    Práctica 36: Hacer un programa que se emule un juego de lanzar 3 dados. En cada
iteración se muestra el resultado sacado en cada uno de los dados y cuánto es el acumulado
de esa tirada de 3 dados. Cuando el usuario pulse en “f” o “F” el programa finaliza y
muestra el acumulado de puntos de sumar todas las tiradas y el número de tiradas
Nota: se puede utilizar Random para el número aleatorio:
Random rnd = new Random();
rnd.nextInt(6); //genera un aleatorio desde 0 hasta 5
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        int suma3Dados = 0;
        int sumaAux = suma3Dados;
        int valorDado1 = 1 + rnd.nextInt(5);
        int valorDado2 = 1 + rnd.nextInt(5);
        int valorDado3 = 1 + rnd.nextInt(5);
        int tiradasAcumuladas = 1;
        suma3Dados = valorDado1 + valorDado2 + valorDado3;
        System.out.println(valorDado1 + " - " + valorDado2 + " - " + valorDado3);
        System.out.println(suma3Dados);
        System.out.println("Pulsa cualquier tecla para continuar. Pulsa f para finalizar");
        Scanner sc = new Scanner(System.in);
        char opcionUsuario = sc.next().charAt(0);
        if (opcionUsuario != 'f' || opcionUsuario != 'F') {
            tiradasAcumuladas++;
            Random rnd2 = new Random();
            valorDado1 = 1 + rnd2.nextInt(5);
            valorDado2 = 1 + rnd2.nextInt(5);
            valorDado3 = 1 + rnd2.nextInt(5);
            suma3Dados = valorDado1 + valorDado2 + valorDado3;
            suma3Dados = sumaAux + suma3Dados;
            System.out.println(valorDado1 + " - " + valorDado2 + " - " + valorDado3);
            System.out.println(suma3Dados);
            System.out.println("Pulsa cualquier tecla para continuar. Pulsa f para finalizar");
            opcionUsuario = sc.next().charAt(0);
        } else {
            int i;
            for (i = 1; opcionUsuario == 'f' || opcionUsuario == 'F'; i++) {
                System.out.println("Has jugado " + tiradasAcumuladas + " veces");

                System.out.println(tiradasAcumuladas);
            }
        }
    }
}
