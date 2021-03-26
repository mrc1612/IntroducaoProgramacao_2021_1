package eduardozortea;

import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double qtdLata = scanner.nextInt();
        double qtdGarrafa600 = scanner.nextInt();
        double qtdGarrafa2000 = scanner.nextInt(); 

        double total = (qtdLata * 350 + qtdGarrafa600 * 600 + qtdGarrafa2000 * 2000)/1000;

        System.out.println("Quantidade de Litros: " + total);
            
        scanner.close();
    }
}
