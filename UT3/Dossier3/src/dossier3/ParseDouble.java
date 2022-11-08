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
public class ParseDouble {
    
    public static double ourParseDouble(String texto) throws NumberFormatException{
        double resultadoDouble = 0.0;
        double resultado = 0.0;
        boolean negativo = false;
        boolean puntoComa = false;
        
        for (int i = 0; i < texto.length(); i++) {
            resultado *=10;
            if(texto.charAt(i)<'0' || texto.charAt(i)>'9'){
                if(texto.charAt(i) == '.' || texto.charAt(i) == ','){
                    puntoComa = true;
                }else if(puntoComa == false){
                    throw new NumberFormatException("no es un dígito: " + texto.charAt(i));
                }
                
            }
            if(texto.charAt(i) == '.' || texto.charAt(i) == ','){
                for(int j = i;j< texto.length(); j++){
                    resultadoDouble += texto.charAt(j)-'0';
                    resultadoDouble /= 10;
                    
                }
                break;
            }
                
            resultado += texto.charAt(i)-'0';    
            
        }
        
        if(texto.startsWith("-")){
            negativo = true;
            texto = texto.substring(1);
        }else if(texto.startsWith("+")){
            texto = texto.substring(1);
        }
        
       
        if(negativo){
            resultado *= -1.0;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Introduzca un numero");
        
        String texto = sc.nextLine();
        double num = 0.0;
        try{
            num = ourParseDouble(texto);
            System.out.println(num);
        }catch(NumberFormatException ex){
            ex.printStackTrace();
        }
        
       
    }
}
