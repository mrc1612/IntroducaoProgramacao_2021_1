import java.util.Scanner;

public class Uni4Exe22 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero do seu respectivo curso: ");
        System.out.println();
        System.out.println("1- Ciencia da Computacao ");
        System.out.println("2- Licenciatura da Computacao");
        System.out.println("3 – Sistemas de Informacao");
        int numero = teclado.nextInt();
        System.out.println();

        switch(numero)
        {
            case 1:
                System.out.println("Bacharel em Ciencia da Computacao");
            break;
            case 2: 
                System.out.println("Licenciado em Computacao");
            break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informacao");
            break;
            default:
                System.out.println("O numero digitado nao tem uma opcao correspondente");
        }
            

    
    }    
}
