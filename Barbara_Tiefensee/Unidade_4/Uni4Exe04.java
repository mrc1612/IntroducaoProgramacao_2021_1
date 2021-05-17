import java.util.*;

public class Uni4Exe04 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        float numero;
        double resultado;

        System.out.println("Informe um numero: ");
        numero = teclado.nextFloat();

        resultado = numero % 1;

        if(resultado == 0)
        {
            System.out.println("Nao foi informada casas decimais no numero");
        }
        else
        {
            System.out.println("Foi informada casas decimais no numero");
        }
    }
}
