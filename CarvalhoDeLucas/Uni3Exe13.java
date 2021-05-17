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
public class Uni3Exe13 {
    
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a largura: ");
        double largura = teclado.nextDouble();
        
        System.out.print("Informe a altura: ");
        double altura = teclado.nextDouble();

        double metroQuadrado = largura * altura; 

        System.out.println("Valor gasto com azulejo: R$" + df.format((metroQuadrado/9) * 12.50));
    }
    
}
