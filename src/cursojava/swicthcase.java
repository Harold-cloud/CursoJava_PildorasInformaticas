/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojava;

/**
 *
 * @author harold
 */
import java.util.*;
import javax.swing.*;

public class swicthcase {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("elige una opcion: \n1: cuadrado \n2: rectangulo\n3: triangulo\n4: circulo");
        
        int opcion_figura = entrada.nextInt();
        
        switch (opcion_figura) {
            case 1: 
                int lado = Integer.parseInt(JOptionPane.showInputDialog("introduce un lado"));
                double cuadrado = Math.pow(lado, 2);
                System.out.println("el area del cuadrado es " + cuadrado);
                break;
                
            case 2: 
                int base =  Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
                int altura =  Integer.parseInt(JOptionPane.showInputDialog("introduce la altura"));
                int rectangulo = base * altura;
                System.out.println("el area del rectangulo es: " + rectangulo);
                break;
            case 3: 
                base =  Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
                altura =  Integer.parseInt(JOptionPane.showInputDialog("introduce la altura"));
                int triangulo = (base * altura)/2;
                System.out.println("el area del triangulo es: " + triangulo);
                break;
            case 4:
               int radio =  Integer.parseInt(JOptionPane.showInputDialog("introduce el radio"));
                double circulo = Math.PI * (Math.pow(radio,2));
                System.out.println("el area del circulo es: " );
                System.out.printf("%1.2f", circulo);
                break;
            default:
                System.out.println("numero no valido");
        }
        
    }
}
