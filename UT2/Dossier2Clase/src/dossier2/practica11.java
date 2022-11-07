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
public class practica11 {

    /*
    Práctica 11: Introducir en un código java de NetBeans las siguientes líneas:
    int x,y;
    x= 3;
    y= 4;
    y *= ++x;
    System.out.println("x=" + x +" y=" + y);
    ¿ qué resultado sale para los valores x e y ? Escribe las líneas de código equivalentes si no
    usáramos el operador incremento: ++ ni el operador de asignación combinado: *=
     */
    public static void main(String[] args) {

        //int x,y;
        //x= 3;
        //y= 4;
        //y *= ++x;
        //System.out.println("x=" + x +" y=" + y);    
        //}
        //Muestra los valores 4 para x y 16 para y.
        //A continuacion, el codigo con las lineas de codigo equivalentes.
        int x, y;
        x = 3;
        y = 4;
        x = x + 1;
        y = y * x;

        System.out.println("x=" + x + " y=" + y);
    }

}
