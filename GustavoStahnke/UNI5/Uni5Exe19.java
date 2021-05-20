import java.util.Scanner;

public class Uni5Exe19 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        double valorTotal = 0;
        double valorCompraDesconto = 0;

        System.out.print("Informe o valor da compra: ");
        double valorCompra = tec.nextDouble();

        while (valorCompra != 0)
        {
            if (valorCompra <= 500)
                valorCompraDesconto += valorCompra * .85;
            else
                valorCompraDesconto += valorCompra * .80;

            valorTotal += valorCompraDesconto;

            System.out.println("Valor da compra com desconto: " + valorCompraDesconto);

            System.out.print("Informe o valor da compra: ");
            valorCompra = tec.nextDouble();
        }

        System.out.println("O valor total da compra: " + valorTotal);
        
        tec.close();
    }
}