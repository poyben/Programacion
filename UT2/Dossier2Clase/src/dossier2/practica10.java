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
public class practica10 {

    /*
    Práctica 10: Introducir en un código java de NetBeans las siguientes líneas:
    int x,y;
    x=3;
    y=++x;
    System.out.println(“Resultado con prefijo: x = “ + x + “ y = “ + y);
    x=3;
    y=x++;
    System.out.println(“Resultado con postfijo: x = “ + x + “ y = “ + y);
    ¿ qué resultado sale para los valores x e y ?
     */
    public static void main(String[] args) {

        int x, y;
        x = 3;
        y = ++x;
        System.out.println("Resultado con prefijo: x = " + x + " y = " + y);
        x = 3;
        y = x++;
        System.out.println("Resultado con postfijo: x = " + x + " y = " + y);

//En el primer caso muestra los valores 4 para x y 4 para y.
//En el segundo caso muestra los valores 4 para x y 3 para y.
    }
}
