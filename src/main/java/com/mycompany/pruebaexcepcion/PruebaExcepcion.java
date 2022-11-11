/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pruebaexcepcion;

import java.util.Scanner;

/**
 *
 * @author PCdoctor
 */
public class PruebaExcepcion {

    public static void main(String[] args) {
        division();
    }public static void formatoNumero() {
        int numero;
        String cadena=" 1";
        numero = Integer.parseInt(cadena);
        
    } public static void formatoNumero1() {
        int numero;
        String cadena=" 1";
        try{
            numero = Integer.parseInt(cadena);
        }
        catch (NumberFormatException ex){
            System.out.println("No es un numero, es una cadena de texto"+ex.getMessage());
        }
        
    }
    public static void desborde() {
        int v[]= new int [3];
        try{
        for (int i=0; i<5; i++){
            v[i]=i;
        }
        
        }
        catch (RuntimeException ex){
            System.out.println("ERROR "+ex.getMessage());
        }
        
    }
    public static void aritmetico() {
        int numero=5, resultado;
        try{
        resultado= numero/0;
        }
        catch (RuntimeException ex){
            System.out.println("Asi no era profe intentelo de nuevo :)"+ ex.getMessage());
            
        }
    }
    /*Cree un programa que lea un entero y lea un divisor, realice la división mostrando
    los números leídos y el resultado, haga diversas pruebas como ingresar valores
    tipo texto y dividir por 0, trate las excepciones generadas.*/
    
    public static void division() {
        Scanner sc = new Scanner (System.in); 
        String num1=sc.nextLine(), div1=sc.nextLine();
        int n, m, res = 0;
        
         try{ 
              n= Integer.parseInt(num1);
        
        }catch(NumberFormatException ex){
            
             System.out.println("Error"+ex.getMessage()); 
        }try{ 
              m= Integer.parseInt(div1);
        
        }catch(NumberFormatException ex){
            
             System.out.println("Error"+ex.getMessage()); 
        }try{ 
              n= Integer.parseInt(num1);
              m= Integer.parseInt(div1);
              res = n / m;
        
        }catch(ArithmeticException ex){
            
             System.out.println("Error"+ex.getMessage()); 
        } System.out.println(res);
    } 
}
