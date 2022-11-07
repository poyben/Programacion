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
public class practica35 {

    /*
    Práctica 35: Sabiendo que:
char letra = 'a';
letra++;
System.out.println(letra);
nos muestra la letra ‘b’ tenemos una forma para ir mostrando las diferentes letras
incrementando una variable. Usar un bucle for y mostrar en pantalla la secuencia de las 10
primeras letras del abecedario ( todas en minúscula)
     */
    public static void main(String[] args) {

        char letra;
        //letra++;
        //System.out.println(letra);

        for (letra = 'a'; letra < 'a' + 10; letra++) {
            System.out.println(letra);
        }
    }
}
