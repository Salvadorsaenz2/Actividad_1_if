/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_1_if;

import java.util.Scanner;

/**
 *
 * @author salva
 */
public class Actividad_1_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner entrada = new Scanner(System.in);
       
       System.out.println("Introduce un año");
       int año = entrada.nextInt();
       int añot = 0;
       
       if(año < 2021){
           añot = 2021 - año;
           System.out.println("Han pasado " + añot + " años");
       } else if(año > 2021){
           añot = año - 2021;
           System.out.println("Faltan " + añot + " años");
       } else{
           System.out.println("Estamos en el mismo año");
       }
       
    }

}

     
