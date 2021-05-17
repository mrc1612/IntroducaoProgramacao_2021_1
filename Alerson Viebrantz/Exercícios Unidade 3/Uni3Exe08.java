import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double dolar, real, total;

        System.out.println("Informe a quantidade de reais que deseja cambiar: R$");
        real = teclado.nextDouble();
        System.out.println("Informe o câmbio do dólar, R$");
        dolar = teclado.nextDouble();

        total = real/dolar;

        System.out.println("Você irá resgatar $"+total+"");

        teclado.close();
    }
}
