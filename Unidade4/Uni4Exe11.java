import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Uni4Exe11 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a idade do primeiro irmao: ");
        int irmao_1 = teclado.nextInt();

        System.out.println("Insira a idade do segundo irmao: ");
        int irmao_2 = teclado.nextInt();

        System.out.println("Insira a idade do terceiro irmao: ");
        int irmao_3 = teclado.nextInt();

        if(irmao_1 == irmao_2 && irmao_1 == irmao_3) {
            System.out.println("Trigemeos");
        } else if(irmao_1 == irmao_2 && irmao_1 != irmao_3) {
            System.out.println("Gemeos: os irmaos 1 e 2");
        } else if( irmao_1 == irmao_3 && irmao_1 != irmao_2) {
            System.out.println("Gemeos: os irmaos 1 e 3");
        } else if( irmao_2 == irmao_3 && irmao_2 != irmao_1) {
            System.out.println("Gemeos: os irmaos 2 e 3");
        } else{
            System.out.println("Sao apenas irmaos");
        }
    }
}