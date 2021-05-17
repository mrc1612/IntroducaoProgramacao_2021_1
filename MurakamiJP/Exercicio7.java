import java.util.Scanner;

public class Exercicio7{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantida 350");
        double qtdLata = scanner.nextInt();
        
        System.out.println("Quantida 600");
        double qtdGarrafa600 = scanner.nextInt();
        
        System.out.println("Quantida 2 Litros");
        double qtdGarrafa2L = scanner.nextInt(); 

        double total = (qtdLata * 350 + qtdGarrafa600 * 600 + qtdGarrafa2L* 2000)/1000;

        System.out.println("Quantidade de Litros: " + total);
            
        scanner.close();
    }
}