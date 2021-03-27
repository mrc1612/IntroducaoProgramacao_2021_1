  
import java.util.Scanner;
public class Uni3Exec13 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double azulejo, areaParede, comprimento, altura, valorGasto;

        azulejo = 112.50; 
        
        System.out.println("Coloque o comprimento: ");
        
        comprimento = scanner.nextDouble();
        System.out.println("Coloque a altura: ");
        altura = scanner.nextDouble();
        areaParede = (comprimento * altura);
        valorGasto = (areaParede * azulejo);
        
        System.out.println("O valor a ser pago é R$" + valorGasto);

        scanner.close();
    }
}