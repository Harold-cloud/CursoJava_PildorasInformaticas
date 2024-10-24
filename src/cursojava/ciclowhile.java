/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojava;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author harold
 */
public class ciclowhile {

    public static void main(String[] args) {

        String contraseña = "contra123";
        String acceso = "";

        System.out.println("Ingrese la contraseña");

        while (!acceso.equals(contraseña)) { //negacion

            acceso = JOptionPane.showInputDialog("Introduce contraseña");

            if (acceso == null) {
                System.out.println("accion cancelada");
                return;
            }
        }

        if (!acceso.equals(contraseña)) {   //negacion
            System.out.println("contraseña incorrecta");
        }

        System.out.println("acceso permitido");

        int numero_aleatorio = (int) (Math.random() * 100);

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int intentos = 0;

        while (numero != numero_aleatorio) {
            System.out.println("introduce un numero");
            numero = sc.nextInt();
            intentos++;
            if (numero_aleatorio<numero) {
                System.out.println("mas bajo");
            }
            
           else if (numero_aleatorio>numero) {
                System.out.println("mas alto");
            }
           
           else if(numero_aleatorio==numero){
                System.out.println("haz acertado");
                System.out.println("intentos: " + intentos);
           }
             
        }

    }
}
