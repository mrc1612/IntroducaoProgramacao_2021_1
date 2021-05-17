import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor em dólares: ");
        double moeda_dolar = teclado.nextDouble();
        
        System.out.println("Informe a cotação em dólar: ");
        double cotacaoDolarReal = teclado.nextDouble();
        
        System.out.println("Dolares em reais, de acordo com a cotação: " + (moeda_dolar*cotacaoDolarReal));
        
        teclado.close();
    }   
}