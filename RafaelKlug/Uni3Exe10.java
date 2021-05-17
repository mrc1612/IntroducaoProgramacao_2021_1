import java.util.Scanner;
import java.lang.Math;

public class Uni3Exe10 {

    /*Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa. Fórmula: hipotenusa2 = cateto1 + cateto2*/
    public static void main(String[] args) throws Exception {
            Scanner teclado = new Scanner(System.in);
            double hip, cat1, cat2;
            /*hip = hipotenusa, cat1 = cateto 1, cat2 = cateto 2*/
            System.out.println("Digite o comprimento do primeiro cateto: ");
            cat1 = teclado.nextDouble();
            System.out.println("Digite o comprimento do segundo cateto: ");
            cat2 = teclado.nextDouble();

            cat1 = Math.pow(cat1, 2);
            cat2 = Math.pow(cat2, 2);

            hip = (cat1 + cat2);

            hip = Math.sqrt(hip);

            System.out.println("O comprimento da hipotenusa do seu triangulo é de: " + hip + " cm");

            teclado.close();
        }
}
