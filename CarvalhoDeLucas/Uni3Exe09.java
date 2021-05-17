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
public class Uni3Exe09 {
    
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("###,##0.00");

        Scanner teclado = new Scanner(System.in);
        
        double pi = Math.PI;
        
        System.out.print("Informe o raio da lata de óleo: ");
        double raio = teclado.nextDouble();
        
        System.out.print("Informe a altura da lata de óleo: ");
        double altura = teclado.nextDouble();
        
        double volume = pi * (raio * raio) * altura;
        
        System.out.println("O volume da lata de óleo é de " + df.format(volume) + "m³");
    
    }
    
}
