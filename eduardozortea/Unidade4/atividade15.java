package eduardozortea.Unidade4;

import java.util.Scanner;

public class atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        int meses = scanner.nextInt();

        if(meses <= 12) {
            System.out.println("Reajuste: " + (salario * 0.05));
        }
        else {
            System.out.println("Reajuste: " + (salario * 0.07));
        }

        scanner.close();
    }
}
