import java.util.Scanner;

public class Uni4Exe03 
{
    public static void main(String[] args) throws Exception
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o primeiro numero: ");
        int numero = teclado.nextInt();
        System.out.println("Insira o segundo numero: ");
        int numero2 = teclado.nextInt();
        if(numero > numero2)
        {
            System.out.println("O numero " + numero +" eh maior que o numero " + numero2);
        }
        if (numero2 > numero)
        {
            System.out.println("O numero " + numero2 +" eh maior que o numero " + numero);
        }
        else
        {
            System.out.print("Os dois numero sao iguais");
        }

        
        
    }    
}
