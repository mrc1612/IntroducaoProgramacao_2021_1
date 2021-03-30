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
public class Uni3Exe01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o comprimento do terreno: ");
        int comprimento = teclado.nextInt();
        
        System.out.print("Informe a largura do terreno: ");
        int largura = teclado.nextInt();

        int area = comprimento * largura;

        System.out.println("A área do terreno é de: " + area);

    }

}
