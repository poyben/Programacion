/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier2;

/**
 *
 * @author Ruben Gonzalez Sabina
 */
public class practica14 {

    /*
    Práctica 14: Si tenemos las líneas de código:
int x=3, y=4;
int z = !(x<=y)?x:y ;
System.out.println(z);
¿qué valor nos va a mostrar en pantalla ?
Escribe ahora
System.out.println( 5 > 3 );
¿ qué muestra en pantalla ?
y ahora escribe:
System.out.println( 5 < 3 );
¿ qué muestra la pantalla ?
     */
    public static void main(String[] args) {

        int x = 3, y = 4;
        int z = !(x <= y) ? x : y;
        System.out.println(z);
        //Muestra el valor 4
        System.out.println(5 > 3);
        //Muestra el mensaje "true"
        System.out.println(5 < 3);
        //Muestra el mensaje "false"
    }

}
