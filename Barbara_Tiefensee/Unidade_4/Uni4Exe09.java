import java.util.*;

public class Uni4Exe09 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Informe o primeiro número: ");
        numero1 = teclado.nextInt();

        System.out.println("Informe o segundo número: ");
        numero2 = teclado.nextInt();

        if(numero1 > numero2 && numero1 % numero2 == 0)
        {
            System.out.println("Esses numeros sao multiplos");
        }
        else if(numero2 > numero1 && numero2 % numero1 == 0)
        {
            System.out.println("Esses numeros sao multiplos");
        }
        else
        {
            System.out.println("Esses numeros nao sao multiplos");
        }
    }
}
