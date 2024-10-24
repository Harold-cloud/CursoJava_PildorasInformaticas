/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojava;

/**
 *
 * @author harold
 */
public class clasestring {
    
    public static void main (String[] args){
        
        String nombre = "briwer"; 
        
        System.out.println(nombre);
        
        System.out.println(nombre + " tiene " + nombre.length() + " letras"); 
        // .length es un metodo que nos da la longitud de un String
        
        System.out.println(nombre + " empieza por " + nombre.charAt(0)); 
        // .charAt() es un metodo que devuelve un caracter de un String dependiendo de la posicion que se le asigne
        
        char ultima_letra = nombre.charAt(nombre.length()-1); 
        // operacion fundamental para dar con el ultimo caracter de cualquier String
        
        System.out.println(nombre + " termina por " + ultima_letra);
        
        String frase = "el exito no es la clave de la felicidad, la felicidad es la clave del éxito";
        
        String subfrase = frase.substring(3, 8) + " es igual a" + frase.substring(29, 39); 
        //.substring extrae los caracteres de un String desde la posicion inicial que se indique hasta la posicion final + 1 
        
        System.out.println(subfrase);
        
        String palabra1, palabra2;
        
        palabra1 = "Hola";
        palabra2 = "hola";
        
       boolean comparacacion = palabra1.equals(palabra2); 
       //.equals hace una comparacion entre dos String y verifica si son iguales o no dando una salida booleana
       
       boolean comparacacion_ignorecase = palabra1.equalsIgnoreCase(palabra2); 
       //.equalsIgnoreCase hace una comparacion entre dos String sin importar si es mayuscula o no y verifica si son iguales o no dando una salida booleana
       
        System.out.println(comparacacion);
        System.out.println(comparacacion_ignorecase);
    }
    
}
