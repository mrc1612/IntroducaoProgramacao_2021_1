package eduardozortea;

import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso = scanner.nextDouble();

        System.out.println("Valor do prato: R$ " + ((peso - 0.750) * 25));
    }
}
