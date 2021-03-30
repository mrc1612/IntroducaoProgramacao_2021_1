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
public class Uni3Exe05 {
    
    public static void main(String[] args){
        
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        Scanner teclado = new Scanner(System.in);
        
        double chip = 4;
        double alimento = 3.50;
        
        System.out.print("Informe o número de frangos: ");
        double frangos = teclado.nextDouble();
        
        double gasto = (chip + (alimento * 2)) * frangos;
        
        System.out.println("O gasto com os frangos é de R$" + df.format(gasto));
        
    }
    
}
