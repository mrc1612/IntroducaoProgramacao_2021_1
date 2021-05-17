import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Uni4Exe06 
{
    public static void main(String[] args) throws Exception
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite M para Masculino \n F para feminino \nI para Nao informado: ");
        string letra = teclado.next();

        if(letra == 'M' || letra == 'm')
        {
            System.out.println("Masculino");
        }
        else if(letra == 'F' || letra == 'f')
        {
            System.out.println("Feminino");
        }
        else if(letra == 'I' || letra == 'i')
        {
            System.out.println("Nao informado");
        }
        else 
        {
            System.out.println("Entrada incorreta");
        }
    }    
}