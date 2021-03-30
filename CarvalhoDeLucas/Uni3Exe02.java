/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Lucas Eduardo
 */
public class Uni3Exe02 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe o valor do calçado: R$");
        double valorCalcado = teclado.nextInt();
        
        double desconto = valorCalcado * 0.12;
        double valorFinal = valorCalcado - desconto;
        
        System.out.println("Valor do descont é de R$" + desconto);
        System.out.println("O preço do par de sapatos com desconto é R$" + valorFinal);
        
    }
    
}
