import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double numero;
        System.out.println("Informe um número maior ou igual a zero.");
        numero = ler.nextDouble();
        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else { 
            System.out.println("O número é impar");
        }
    }
}
