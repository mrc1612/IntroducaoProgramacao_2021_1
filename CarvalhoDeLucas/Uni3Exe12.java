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
public class Uni3Exe12 {
    
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.print("Horas trabalhadas: ");
        double horas = teclado.nextDouble();
        
        System.out.print("Dependentes: ");
        int dependentes = teclado.nextInt();

        double salarioTrabalho = horas * 10.00;
        double salarioDependentes = dependentes * 60.00;

        double salarioDescontado = salarioTrabalho - ((0.085 * salarioTrabalho) + (0.05 * salarioTrabalho));

        System.out.println("Nome: " + nome);
        System.out.println("Salario Bruto: " + df.format(salarioTrabalho + salarioDependentes));
        System.out.println("Salario Liquido: " + df.format(salarioDescontado + salarioDependentes));
    }
    
}
