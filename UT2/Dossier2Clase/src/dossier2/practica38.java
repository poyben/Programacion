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
public class practica38 {

    /*
    Práctica 38: Hacer un programa que recibe un número de horas, por ejemplo 135.25 y lo
convierte a un formato de: días, horas, minutos, segundos. Siguiendo el ejemplo anterior:
5días 15horas 15minutos 0segundos
     */
    public static void main(String[] args) {

        System.out.println("Introduce un numero de horas");
        Scanner sc = new Scanner(System.in);

        int minutos, horas, dias;
        float horasUsuario = sc.nextFloat();
        float segundosTotales = horasUsuario * 3600;

        dias = (int) (float) segundosTotales / 86400;
        segundosTotales %= 86400;

        horas = (int) (float) segundosTotales / 3600;
        segundosTotales %= 3600;

        minutos = (int) (float) segundosTotales / 60;
        segundosTotales %= 60;

        System.out.println(dias + "dias " + horas + "horas " + minutos + "minutos " + segundosTotales + "segundos");
    }

}
