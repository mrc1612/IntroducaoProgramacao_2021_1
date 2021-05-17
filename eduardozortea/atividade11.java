package eduardozortea;

import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperaturaC = scanner.nextDouble();

        System.out.println("Sua temperatura em F: " + (9/5*temperaturaC + 32));

        scanner.close();
    }
}
