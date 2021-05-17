import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double dolar;
        double real;
        double total;

        System.out.println("Informe a quantia de dinheiro que deseja converter: R$");
        real = teclado.nextDouble();
        System.out.println("Informe o valor do dólar, R$");
        dolar = teclado.nextDouble();

        total = real/dolar;

        System.out.println("Você irá resgatar $"+total);
    }
}