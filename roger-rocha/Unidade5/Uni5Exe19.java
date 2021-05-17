import java.util.Scanner;

public class Uni5Exe19 
{

    /*Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo com o valor da compra efetuada.
O desconto é de 20% caso o valor da compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual.
Descreva um algoritmo que leia o valor da compra e escreva o total a pagar a cada compra.
Informe também o valor total recebido pela loja ao final do dia. A leitura deve ser finalizada com a leitura 0 para o valor da compra. */    

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double valor = 1;
        double pagar = 0;

        while(valor != 0)
        {
            System.out.println("Entre com o valor da compra: (caso queira terminar o programa entre com 0)");
            valor = sc.nextDouble();
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
        
    }    
}
