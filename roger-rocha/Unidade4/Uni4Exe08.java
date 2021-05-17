import java.util.Scanner;

public class Uni4Exe08 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite somente uma letra: ");
        char letra = teclado.next().charAt(0);
        letra = Character.toUpperCase(letra);
        if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')
        {
            System.out.println("Essa letra informada: " + letra + ",eh uma vogal");
        }
        else
        {
            System.out.println("Essa letra informada: " + letra + " eh uma consoante");
        }

    }    
}
