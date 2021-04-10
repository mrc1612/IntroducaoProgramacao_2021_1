import java.util.Scanner;

public class Uni4Exe02 
{
    public static void main(String[] args) throws Exception
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o numero: ");
        int numero = teclado.nextInt();
        if(numero % 2 == 0)
        {
            System.out.println("O numero: " + numero + " eh par");
        }
        else
        {
            System.out.println("O numero: " + numero + " eh impar");
        }

    }   
}
