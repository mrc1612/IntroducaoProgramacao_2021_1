/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Lucas Eduardo
 */
public class Uni3Exe10 {
    
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("###,##0.00");

        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Informe o valor do cateto 1: ");
        double cateto1 = teclado.nextDouble();
        
        System.out.print("Informe o valor do cateto 2: ");
        double cateto2 = teclado.nextDouble();
        
        double hipotenusa = Math.sqrt((Math.pow(cateto1, 2) + (Math.pow(cateto2, 2))));
        
        System.out.println("A hipotenusa é " + df.format(hipotenusa));
        
    }
    
}
