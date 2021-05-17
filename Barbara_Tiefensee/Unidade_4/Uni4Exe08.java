import java.util.*;

public class Uni4Exe08 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        char letra;

        System.out.println("Informe uma letra: ");
        letra = teclado.next().charAt(0);

        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
        {
            System.out.println("A letra " + letra + " eh vogal");
        }
        else
        {
            System.out.println("A Letra " + letra + " nao eh vogal");
        }
    }
}
