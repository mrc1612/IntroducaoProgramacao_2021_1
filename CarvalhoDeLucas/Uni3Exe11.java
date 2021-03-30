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
public class Uni3Exe11 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("###,##0.00");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a temperatura em ºC ");
        double temperaturaC = teclado.nextDouble();

        double temperaturaF = (9.0 / 5.0) * temperaturaC + 32;
        
        System.out.println("A temperatura em ºF é de " + df.format(temperaturaF));

    }

}
