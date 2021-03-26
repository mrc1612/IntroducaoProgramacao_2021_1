package eduardozortea;

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double preco = scanner.nextDouble();
        double pagamento = scanner.nextDouble();

        System.out.println("litros de gasolina abastecidos: " + (pagamento/preco));
        
    }
}
