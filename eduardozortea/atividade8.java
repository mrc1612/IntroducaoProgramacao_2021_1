package eduardozortea;

import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dolar = scanner.nextDouble();
        double cotacaoDolarReal = 5.0;

        System.out.println("dolar em reais: " + (dolar*cotacaoDolarReal));
    }
}