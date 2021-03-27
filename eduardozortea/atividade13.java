package eduardozortea;

import java.util.Scanner;

public class atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double largura = scanner.nextDouble();
        double altura = scanner.nextDouble();

        double metroQuadradoParede = largura * altura;

        System.out.println("valor gasto com azulejo: " + ((metroQuadradoParede/9) * 12.50));
        
        scanner.close();
    }
}
