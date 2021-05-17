import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Uni4Exe11 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a idade do Irmao1: ");
        int irmao1 = teclado.nextInt();
        System.out.println("Insira a idade de Irmao2: ");
        int irmao2 = teclado.nextInt();
        System.out.println("Insira a idade de Irmao3: ");
        int irmao3 = teclado.nextInt();

        if(irmao1 == irmao2 && irmao1 == irmao3)
        {
            System.out.println("Eles sao TRIGEMEOS");
        }
        else if(irmao1 == irmao2 && irmao1 != irmao3)
        {
            System.out.println("Eles sao GEMEOS, os irmaos 1 e 2");
        }
        else if( irmao1 == irmao3 && irmao1 != irmao2)
        {
            System.out.println("Eles sao GEMEOS, os irmaos 1 e 3");
        }
        else if( irmao2 == irmao3 && irmao2 != irmao1)
        {
            System.out.println("Eles sao GEMEOS, os irmaos 2 e 3");
        }
        else
        {
            System.out.println("Eles sao apenas irmaos");
        }
    }    
}
