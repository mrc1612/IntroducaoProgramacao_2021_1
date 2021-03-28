package eduardozortea;

import java.util.Scanner;

public class atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int preco = scanner.nextInt();
        int valorPago = scanner.nextInt();

        int troco = valorPago - preco;

        int notas100 = troco / 100;
        int notas10 = (troco - (notas100*100)) / 10;
        int notas1 = (troco - (notas100*100) - (notas10*10)) / 1;

        System.out.println("sera preciso " + (notas100 + notas10 + notas1) + " notas");
        System.out.println(notas100 + " notas de 100");
        System.out.println(notas10 + " notas de 10");
        System.out.println(notas1 + " notas de 1");

        scanner.close();
    }
}
