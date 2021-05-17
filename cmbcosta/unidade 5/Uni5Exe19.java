import java.util.Scanner;

public class Uni5Exe19 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double valor = 1;
        double pagar = 0;

        while(valor != 0)
        {
            System.out.println("Entre com o valor da compra: (caso queira terminar o programa entre com 0)");
            valor = scanner.nextDouble();
            if(valor == 0)
            {
                break;
            }
            if(valor > 500)
            {
                pagar = valor - (valor * 0.20);
            }
            if(valor <= 500)
            {
                pagar = valor - (valor * 0.15);
            }
            System.out.println("O valor a pagar da conta ja com desconto sera de: " + pagar + " reias");
        }
        scanner.close();
    }    
}