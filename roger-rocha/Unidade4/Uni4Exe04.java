import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) throws Exception
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o numero: ");
        float numero = teclado.nextFloat();
        if(numero % 1 == 0)
        {
            System.out.println("Nao foram informadas casas decimais no numero");
        }
        else
        {
            System.out.println("Foi informada casas decimais no numero");
        }
        

        
    }
}
