package eduardozortea;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdFrango = scanner.nextInt();

        System.out.println("Gasto por frango: " + ((4.00)+(3.50*2)));
        System.out.println("gasto total: " + ((4.00 + 3.50*2)*qtdFrango));
    
        scanner.close();
    }
}
