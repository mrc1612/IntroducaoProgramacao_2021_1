import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Uni4Exe06 
{
    public static void main(String[] args) throws Exception
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite M para Masculino, F para feminino, I para Nao informado: ");
        char letra = teclado.next().charAt(0);
        letra = Character.toUpperCase(letra);
        if(letra == 'M')
        {
            System.out.println("MASCULINO");
        }
        else if(letra == 'F')
        {
            System.out.println("FEMININO");
        }
        else if(letra == 'I')
        {
            System.out.println("NAO INFORMADO");
        }
        else 
        {
            System.out.println("ENTRADA INCORRETA");
        }
    }    
}
