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
public class practica26 {
    
    /*
    Práctica 26: Escribe un programa que pida por teclado un día de la semana ( ún número
entero del 1 al 5 que representa de lunes a viernes ) y que diga qué asignatura toca a primera
hora ese día.
    */
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un dia de la semana (del 1 al 5 siendo el 1 el lunes)");
        
        int dia = sc.nextInt();
        switch (dia){
            case 1: System.out.println("Toca programacion a primera hora");
            break;
            case 2: System.out.println("Toca entornos de desarrollo a primera hora");
            break;
            case 3: System.out.println("Toca bases de datos a primera hora");
            break;
            case 4: System.out.println("Toca programacion a primera hora");
            break;
            case 5: System.out.println("Toca entornos de desarrollo a primera hora");
            
        }
    }
    
}
