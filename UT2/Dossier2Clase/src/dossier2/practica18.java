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
public class practica18 {

    /*
    Práctica 18: Escribe un programa que calcule el salario semanal de un empleado en base
a las horas trabajadas, a razón de 18 euros la hora
     */
    public static void main(String[] args) {

        System.out.println("Introduce el numero de horas que trabajas semanalmente");
        Scanner sc = new Scanner(System.in);
        double horasSemana = sc.nextDouble();
        double salarioSemana = 18 * horasSemana;
        System.out.println("Tu sueldo semanal es de " + salarioSemana + " euros");

    }

}
