import java.util.Scanner;

public class Uni3Exe05 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int frangos;
        System.out.println("Informe quantos frangos o senhor tem na sua granja :");
        frangos = teclado.nextInt();
        System.out.println("O total gasto para marcar todos os frangos é de R$: " + (frangos * 11));
        

    }    
}
