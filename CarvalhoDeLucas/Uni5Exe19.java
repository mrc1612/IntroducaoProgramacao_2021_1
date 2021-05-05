import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double valorCompra = -1;
        double desconto = 0;

        double valorLoja = 0;

        while (valorCompra != 0) {

            System.out.print("Informe o valor da compra: R$");
            valorCompra = teclado.nextDouble();

            if (valorCompra > 500) {
                desconto = valorCompra * 0.2;
            } else {
                desconto = valorCompra * 0.15;
            }

            valorLoja += valorCompra - desconto;

            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor da compra: R$" + (valorCompra - desconto));

        }

        System.out.println("Total loja: R$" + valorLoja);

        teclado.close();

    }
}
