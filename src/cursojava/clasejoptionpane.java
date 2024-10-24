/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojava;

import javax.swing.*;

/**
 *
 * @author harold
 */
public class clasejoptionpane {
    
    public static void main (String[] args){
        
          String usuario_panel = JOptionPane.showInputDialog("escribe tu nombre");
          String usuario_edad = JOptionPane.showInputDialog("escribe tu edad");
          int edad_usuario = Integer.parseInt(usuario_edad);
          System.out.println(usuario_panel + " tiene " + edad_usuario);
          
          String numero = JOptionPane.showInputDialog("escribe un numero");
          double numero_dou = Double.parseDouble(numero); // es un formato de conversion de datos 
          double raiz = Math.sqrt(numero_dou);
          System.out.printf("%1.2f",raiz); 
        
    }
}
