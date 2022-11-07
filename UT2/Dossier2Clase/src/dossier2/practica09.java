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
public class practica09 {

    /*
    Práctica 9: Sea: a, b enteros; c,d reales; e,f carácter; g de tipo lógico. ¿ qué asignaciones son
    válidas y cuáles no?. Justifica por qué no
    a) a = 20; b) b = 5500; c) e = ‘f’;
    d) g = true; f) b = 12; g) c = 0;
    h) e = f; i) g = “false”; j) f = ‘0’;
    k) d = c l) a = 12.56; m) f = g;
     */
    public static void main(String[] args) {

        int a = 20; //Valido
        int b = 5500; //Valido
        char e = 'f'; //Valido
        double g = true; //No es valido porque los valores de true o false son booleanos.
        int b2 = 12; //Valido
        double c = 0; //Valido
        char e2 = f; //No es valido, falta meter f entre comillas.
        double g2 = "false"; //No es valido, "false" entre comillas, funciona como string, y sin las comillas debería ser booleano.
        char f = '0'; //Valido
        double d = c; //valido en caso de tener declarada la variable c del mismo tipo que la d
        int a2 = 12.56; //No es valido porque 12.56 debería ser tipo double
        char f2 = g; //No es valido porque faltaría meter la g entre comillas

    }
}
