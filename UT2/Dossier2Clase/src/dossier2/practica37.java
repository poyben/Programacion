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
public class practica37 {

    /*
    Práctica 37: Crear un programa que le pregunte al usuario la cantidad de billetes que tiene
de 500, luego le pregunte por la cantidad de billetes que tiene de 200, después pregunte por
los de 100, 50, 20, 10, 5. Finalmente se le dirá al usuario la cantidad de dinero acumulado
que tiene en billetes.
     */
    public static void main(String[] agrvs) {

        int bill500, bill200, bill100, bill50, bill20, bill10, bill5, sumaDinero;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Cunatos billetes de 500 tienes?");
        bill500 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Cunatos billetes de 200 tienes?");
        bill200 = sc2.nextInt();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Cunatos billetes de 100 tienes?");
        bill100 = sc3.nextInt();

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Cunatos billetes de 50 tienes?");
        bill50 = sc4.nextInt();

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Cunatos billetes de 20 tienes?");
        bill20 = sc5.nextInt();

        Scanner sc6 = new Scanner(System.in);
        System.out.println("Cunatos billetes de 10 tienes?");
        bill10 = sc6.nextInt();

        Scanner sc7 = new Scanner(System.in);
        System.out.println("Cunatos billetes de 5 tienes?");
        bill5 = sc7.nextInt();

        sumaDinero = bill500 * 500 + bill200 * 200 + bill100 * 100 + bill50 * 50 + bill20 * 20 + bill10 * 10 + bill5 * 5;

        System.out.println("Tienes " + sumaDinero + " euros en total");

    }

}
