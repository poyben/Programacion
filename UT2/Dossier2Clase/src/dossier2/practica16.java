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
public class practica16 {

    /*
    Práctica 16: Cálculo del área de una Finca. La finca es rectangular así que el usuario
introducirá el número de metros de cada lado y se le mostrará el área calculada tanto en
metros cuadrados como en centímetros cuadrados
     */
    public static void main(String[] args) {

        System.out.println("Introduce la longitud del lado mas corto de la finca");
        Scanner sc = new Scanner(System.in);
        int ladoCorto = sc.nextInt();
        System.out.println("Introduce la longitud del lado mas corto de la finca");
        int ladoLargo = sc.nextInt();
        int area = ladoCorto * ladoLargo;
        System.out.println("El area de su finca es de: " + area + " metros cuadrados o: " + area * 10000 + " centimetros cuadrados");
    }

}
