  
import java.util.Scanner;

public class Uni4Exe10 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Idade de Marquinhos: ");
        int idade_M = teclado.nextInt();

        System.out.println("Idade de Zezinho: ");
        int idade_Z = teclado.nextInt();

        System.out.println("Idade de Luluzinha: ");
        int idade_L = teclado.nextInt();

        if(idade_M < idade_L && idade_M < idade_Z){
            System.out.println("O cacula da familia e Marquinhos");
        } else if(idade_Z < idade_M && idade_Z < idade_L){
            System.out.println("O cacula da familia e Zezinho");
        } else{
            System.out.println("O cacula da familia e Luluzinha");
        }
    } 
}