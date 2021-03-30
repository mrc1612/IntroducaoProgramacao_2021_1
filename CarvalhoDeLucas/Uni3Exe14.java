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
public class Uni3Exe14 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("###,##0.00");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a distancia: ");
        double distancia = teclado.nextDouble();
        
        System.out.print("Informe o tempo: ");
        double tempo = teclado.nextDouble();

        double velocidadeMedia = distancia / tempo;
        double gasolinaGasta = distancia / 12;

        System.out.println("Velocidade média: " + df.format(velocidadeMedia));
        System.out.println("Litros de gasolina gastos: " + df.format(gasolinaGasta));

    }

}
