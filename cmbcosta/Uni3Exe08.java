import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor Dólares: ");
        double dolar = scanner.nextDouble();
        System.out.println("Cotação dólar: ");
        double cotacaoDolarReal = scanner.nextDouble();
        

        System.out.println("dolar em reais: " + (dolar*cotacaoDolarReal));
        
        scanner.close();
    }   
}
