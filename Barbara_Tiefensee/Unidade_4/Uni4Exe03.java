import java.util.*;

public class Uni4Exe03 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Informe o primeiro numero: ");
        numero1 = teclado.nextInt();

        System.out.println("Informe o segundo numero: ");
        numero2 = teclado.nextInt();

        if(numero1 > numero2)
        {
            System.out.println("O numero " + numero1 + " eh maior que o numero " + numero2);
        }
        else
        {
            System.out.println("O numero " + numero2 + " eh maior que o numero " + numero1);

        }
    }
}
