/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojava;

/**
 *
 * @author harold
 */
import java.util.Scanner;

public class condicionales {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
       
        
        int edad = entrada.nextInt();
        
        if(edad < 18){
            System.out.println("eres adolecente");
        }
        else if(edad >= 18){
            System.out.println("eres adulto");
        }
        else {
            System.out.println("no eres grande");
        }
    }
}
