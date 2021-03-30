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
public class Uni3Exe07 {
    
    public static void main(String[] args){
        
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        Scanner teclado = new Scanner(System.in);
        
        double lata = 0.350;
        double garrafinha = 0.600;
        double garrafa = 2;
        
        System.out.print("Quantidade latas ");
        int contLata = teclado.nextInt();
        
        System.out.print("Quantidade garrafinha ");
        int contGarrafinha = teclado.nextInt();
        
        System.out.print("Quantidade garrafas ");
        int contGarrafa = teclado.nextInt();
        
        double total = (lata * contLata) + (garrafinha * contGarrafinha) + (garrafa * contGarrafa);
        
        int litros = String.valueOf(total).indexOf(".");
        
        System.out.println("Litros " + String.valueOf(total).substring(0, litros));
        
    }
    
}
