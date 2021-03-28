package eduardozortea;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valor = scanner.nextDouble();

        double desconto = valor * 0.12;

        System.out.println("Valor do desconto: " + desconto);
        System.out.println("Produto com desconto: " + (valor - desconto));
        
        scanner.close();
    }
}
