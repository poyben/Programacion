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
public class practica07 {

    /*
    Introducir en un código java de NetBeans las siguientes línea:
    final int MAXIMO = 23;
    MAXIMO = 12;
    ¿muestra el IDE algo diferente ? ¿se puede ejecutar el programa?
     */
    public static void main(String[] args) {

        final int MAXIMO = 23;
        MAXIMO = 12;

        //Muestra un error que dice que no se puede asignar el valor 12 a la variable ya que se ha definido como "final int".
        //No se puede ejecutar.
    }
}
