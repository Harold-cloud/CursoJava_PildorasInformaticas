/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojava;

/**
 *
 * @author harold
 */
public class Operadores {
    
    public static void main(String[] args){
        
        int a = 5;
        int b;
        b = 7;
       double x = 10;
       double y = 4;
        
        int c = b + a;
        int d = a  - b;
        int e = a * b;
        double f = a /b;
        
        
        c++;
        c+=6;
        
        System.out.println(c);
        
        final double pulgadas = 2.54;
        double cm = 6;
        double resultado = cm/pulgadas;
        System.out.println(resultado);
        
        int operador1, operador2, operador3;
        operador1 = 8;
        operador2 = 7;
        operador3 = operador1 + operador2;
        System.out.println(operador3);
    }
}
