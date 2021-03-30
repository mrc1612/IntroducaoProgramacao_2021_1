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
public class Uni3Exe16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Preço: ");
        int preco = teclado.nextInt();

        System.out.println("Valor pago: ");
        int valorPago = teclado.nextInt();

        int troco = valorPago - preco;

        int notas100 = troco / 100;
        int notas10 = (troco - (notas100 * 100)) / 10;
        int notas1 = (troco - (notas100 * 100) - (notas10 * 10)) / 1;

        System.out.println("Sera preciso " + (notas100 + notas10 + notas1) + " notas para o troco.");
        System.out.println("Sendo: ");
        System.out.println(notas100 + " notas de 100");
        System.out.println(notas10 + " notas de 10");
        System.out.println(notas1 + " notas de 1");
    }

}
