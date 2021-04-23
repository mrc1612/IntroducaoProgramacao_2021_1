import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Uni4Exe11 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int idade1;
        int idade2;
        int idade3;

        System.out.println("Informe o ano de nascimento do primeiro irmao: ");
        idade1 = teclado.nextInt();

        System.out.println("Informe o ano de nascimento do segundo irmao: ");
        idade2 = teclado.nextInt();

        System.out.println("Informe o ano de nascimento do terceiro irmao: ");
        idade3 = teclado.nextInt();

        if (idade1 == idade2 && idade1 == idade3) 
        {
            System.out.println("Os irmaos sao trigemeos");

        }
        else if(idade1 == idade2 &&  idade1 != idade3)
        {
            System.out.println("O primeiro e so segundo irmaos sao gemeos");
        }
        else if(idade2 == idade3 && idade2 != idade1)
        {
            System.out.println("O segundo e o terceiro irmaos sao gemeos");
        }
        else if(idade3 == idade1 && idade3 != idade2)
        {
            System.out.println("O primeiro e o terceiro irmaos sao gemeos");
        }
        else
        {
            System.out.println("Todo mundo eh apenas irmaos");
        }
    }
}
