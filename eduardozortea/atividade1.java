package eduardozortea;

import java.util.Scanner;

public class atividade1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float lado1 = scanner.nextFloat();
        float lado2 = scanner.nextFloat();

        System.out.println("Area do terreno: " + (lado1 * lado2));
    }
}