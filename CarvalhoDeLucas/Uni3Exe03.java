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
public class Uni3Exe03 {
    
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("O preço da gasolinda é de R$");
        double gasolina = teclado.nextDouble();
        
        System.out.print("Quanto em dinheiro irá abastecer? R$");
        double valor = teclado.nextDouble();
        
        double litros = valor / gasolina;
        
        System.out.println("Irá conseguir abastecer " + df.format(litros) + " litros");
        
    }
    
}
