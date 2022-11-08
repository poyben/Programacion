/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier3;

import java.util.Scanner;

/**
 *
 * @author Ruben Gonzalez Sabina
 */
public class ParseInt {
    
    public static int ourParseInt(String texto) throws NumberFormatException{
        int resultado = 0;
        boolean negativo = false;
        
        if(texto.startsWith("-")){
            negativo = true;
            texto = texto.substring(1);
        }else if(texto.startsWith("+")){
            texto = texto.substring(1);
        }
        
        for (int i = 0; i < texto.length(); i++) {
            resultado *=10;
            if(texto.charAt(i)<'0' || texto.charAt(i)>'9'){
                throw new NumberFormatException("no es un dígito: " + texto.charAt(i));
            }
            resultado += texto.charAt(i)-'0';          
        }
        
        if(negativo){
            resultado *= -1;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Introduzca un numero");
        
        String texto = sc.nextLine();
        int num = 0;
        try{
            num = ourParseInt(texto);
            System.out.println(num);
        }catch(NumberFormatException ex){
            ex.printStackTrace();
        }
        
       
    }
}
