package eduardozortea.Unidade4;

import java.util.Scanner;

public class atividade20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double prova1 = scanner.nextDouble();
        double prova2 = scanner.nextDouble();
        double prova3 = scanner.nextDouble();

        double exercicios = scanner.nextDouble();

        double media = (prova1 + prova2 * 2 + prova3 * 3 + exercicios) / 7;

        if (media >= 9) {
            System.out.println("Media " + media);
            System.out.println("Conceito: A");
            System.out.println("Aprovado");
        } 
        else if (media < 9 && media >= 7.5) {
            System.out.println("Media " + media);
            System.out.println("Conceito: B");
            System.out.println("Aprovado");
        } 
        else if (media < 7.5 && media >= 6) {
            System.out.println("Media " + media);
            System.out.println("Conceito: C");
            System.out.println("Aprovado");
        } 
        else if (media < 6 && media >= 4) {
            System.out.println("Media " + media);
            System.out.println("Conceito: E");
            System.out.println("Reprovado");
        } 
        else {
            System.out.println("Media " + media);
            System.out.println("Conceito: F");
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
