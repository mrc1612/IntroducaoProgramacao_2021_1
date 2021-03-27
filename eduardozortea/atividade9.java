package eduardozortea;

import java.util.Scanner;

public class atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        double altura = scanner.nextDouble();

        System.out.println("volume: " + (3.14 * Math.pow(raio, 2) * altura));
    }
}
