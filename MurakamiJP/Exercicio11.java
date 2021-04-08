import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius para converter para Fahrenheit: ");
        double temperatura_Celsius = teclado.nextDouble();
        
        double conver_para_Fahrenheit = (9.0/5.0);
    
        System.out.println("Sua temperatura em Grau Fahrenheit: " + ((conver_para_Fahrenheit * temperatura_Celsius) + 32));

        teclado.close();
    }
}