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
public class Uni3Exe15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = teclado.nextInt();

        int centena = (numero / 100) % 10;
        int dezena = (numero / 10) % 10;
        int unidade = (numero / 1) % 10;

        System.out.println("Centena: " + centena);
        System.out.println("Dezenas: " + dezena);
        System.out.println("Unidades: " + unidade);
    }

}
