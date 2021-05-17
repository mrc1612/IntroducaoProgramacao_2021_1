import java.util.Scanner;

public class Uni4Exe09 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o primero valor: ");
        int numr1 = teclado.nextInt();
        System.out.println("Informe o segundo valor: ");
        int numr2 = teclado.nextInt();
        
        if(numr1 > numr2  && numr1 % numr2 == 0)
        {
            System.out.println("Esses numeros sao multiplos");
        }
        else if(numr2 > numr1 && numr2 % numr1 == 0)
        {
            System.out.println("Esses numeros sao multiplos");
        }
        else
        {
            System.out.println("Esses numeros nao sao multiplos");
        }
    }    
}
