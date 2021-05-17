import java.util.Scanner;
public class Uni3Exec11 {
    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner(System.in);
       double Cl, Fahr;

        System.out.println("Informe a temperatura em Celsius");

        Cl = teclado.nextDouble();
        
        Fahr = ((1.8 * Cl) + 32);
        
        System.out.println("Convertendo em Fahrenheit: " + Fahr );

        teclado.close();
    }
}