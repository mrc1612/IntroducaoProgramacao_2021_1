import java.util.Scanner;

public class Uni4Exe25 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Escolha uma das opcoes abaixo");
        System.out.println();
        System.out.println("1 - Soma de dois numeros");
        System.out.println("2 - Diferenca entre dois numeros");
        System.out.println("3 - Produto entre dois numeros");
        System.out.println("4 - Divisao entre dois numeros (o denominador nao pode ser zero)");
        int numero = s.nextInt();
        System.out.println();
        System.out.println("Insira os 2 numeros desejados para a operacao");
        float num1 = s.nextFloat();
        float num2 = s.nextFloat();

        switch(numero)
        {
            case 1:
                float num3 = num1 + num2;
                System.out.println("A soma desses 2 numeros eh: " + num3);
            break;
            case 2:
                float num4 = num1 - num2;
                System.out.println("A diferenca desses 2 numeros eh: " + num4);
            break;
            case 3:
                float num5 = num1 * num2;
                System.out.println("O produto desses 2 numeros eh: " + num5);
            break;
            case 4:
                float num6 = num1 / num2;
                System.out.println("A divisao desses 2 numeros eh: " + num6);
            break;
            default:
                System.out.println("OPCAO INVALIDA O NUMERO DE OPERACAO DIGITADO NAO EXISTE"); 
        }


    }
}
