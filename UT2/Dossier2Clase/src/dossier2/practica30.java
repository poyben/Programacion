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
public class practica30 {

    /*
    Práctica 30: Hacer un programa que vaya mostrando un número aleatorio mayor o igual a
10 y menor a 20. Una vez mostrado el número se le pide al usuario si quiere o no continuar.
Si el programa introduce una “c” o una “C” vuelve a mostrar un nuevo número aleatorio. El
programa finaliza cuando usuario introduzca algo diferente. El bucle se deberá realizar
mediante do while
Para el número aleatorio hay varias opciones:
(int)(Math.random()*10);
Math.random() devuelve un double mayor o igual a 0 y menor que 1 si multiplicas por 10
tienes entonces mayor igual a 0 y menor que 10. Si hacemos cast a int: (int) truncamos el
número y tenemos un número entero de 0 a 9 ( ambos inclusive )
     */
    public static void main(String[] args) {
        int max, min;
        Random rnd = new Random();
        int random = 10 + rnd.nextInt(10);
        System.out.println(random);
        System.out.println("Quieres continuar?");
        Scanner sc = new Scanner(System.in);
        char opcionUsuario = sc.next().charAt(0);

        while (opcionUsuario == 'c' || opcionUsuario == 'C') {
            random = 10 + rnd.nextInt(10);
            System.out.println(random);
            System.out.println("Quieres continuar?");
            opcionUsuario = sc.next().charAt(0);
        }
    }
}
