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
public class Uni3Exe08 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("###,##0.00");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a cotação do dolar: R$");
        double dolar = teclado.nextDouble();

        System.out.print("Quanditade de reias que deseja trocar: R$");
        double reais = teclado.nextDouble();

        double troca = reais / dolar;

        System.out.println("Você receberá R$" + df.format(troca));

    }

}
