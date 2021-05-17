import java.util.*;

public class Uni4Exe02 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int numero;
        double resultado;

        System.out.print("Informe um numero: ");
        numero = teclado.nextInt();

        resultado = numero % 2;

        if(resultado == 0)
        {
            System.out.print("O numero eh par");
        }
        else if(resultado != 0)
        {
            System.out.print("O numero eh impar");
        }
    }
}
