import java.util.Scanner;

public class Uni4Exe05 
{
    public static void main(String[] args) throws Exception
    {
        Scanner teclado = new Scanner(System.in);
        boolean azul = true;
        System.out.println("A COR EH AZUL?");
        System.out.println(" S PARA SIM, N PARA NAO");
        char letra = teclado.next().charAt(0);
        letra = Character.toUpperCase(letra);
        if(letra == 'N')
        {
            azul = false;
            System.out.println("NAO");
        }
        else if(letra == 'S')
        {
            azul = true;
            System.out.println("SIM");
        }
        else
        {
            System.out.println("CARACTERE INVALIDO");
        }
    }    
}
