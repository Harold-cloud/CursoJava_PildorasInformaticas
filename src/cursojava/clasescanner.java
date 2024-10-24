package cursojava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harold
 */
import java.util.Scanner;


public class clasescanner {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("escribe tu nombre: ");
        
        String nombreusuario = entrada.nextLine();
        
        System.out.println("escribe tu edad: ");
        
        int edad = entrada.nextInt();
        
        System.out.println(nombreusuario + edad);
        
      
        
    }
}
