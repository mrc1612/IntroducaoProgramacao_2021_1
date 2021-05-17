import java.util.Scanner;

public class Uni4Exe10 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a idade de Marquinhos: ");
        int idadeM = teclado.nextInt();
        System.out.println("Insira a idade de Zezinho: ");
        int idadeZ = teclado.nextInt();
        System.out.println("Insira a idade de Luluzinha: ");
        int idadeL = teclado.nextInt();
        if(idadeM < idadeL && idadeM < idadeZ)
        {
            System.out.println("O cacula da familia eh Marquinhos");
        }
        else if(idadeZ < idadeM && idadeZ < idadeL)
        {
            System.out.println("O cacula da familia eh Zezinho");
        }
        else
        {
            System.out.println("O cacula da familia eh Luluzinha");
        }
    }    
}
