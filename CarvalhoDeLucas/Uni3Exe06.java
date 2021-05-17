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
public class Uni3Exe06 {
    
    public static void main(String[] args){
        
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        Scanner teclado = new Scanner(System.in);
        
        double pesoKg = 25;
        
        System.out.print("Informe peso do prato KG ");
        double pesoPrato = teclado.nextDouble();
        
        double preco = pesoKg * pesoPrato;
        
        System.out.println("Preço ficou em R$" + df.format(preco));  
        
    }
    
}
