import java.util.Scanner;

public class Uni4Exe08 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        string letra = teclado.next();

        if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' || letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("" + letra + ", e uma vogal");
        } else{
            System.out.println("" + letra + " e uma consoante");
        }
    }    
}