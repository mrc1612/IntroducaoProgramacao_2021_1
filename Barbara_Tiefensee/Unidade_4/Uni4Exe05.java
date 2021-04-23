import java.util.*;

public class Uni4Exe05 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        char palavra;
        boolean azul = true;

        System.out.println("A cor eh azul? ");
        System.out.println("(s) para SIM ou (n) para NAO");
        palavra = teclado.next().charAt(0);

        if(palavra == 's')
        {
            azul = true;
            System.out.println("A cor eh azul.");
        }
        else if (palavra == 'n')
        {
            azul = false;
            System.out.println("A cor nao eh azul.");
        }
        else
        {
            System.out.println("Opcao invalida");
        }
    }
}
