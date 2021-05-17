import java.util.Scanner;

public class Uni4Exe09 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primero valor: ");
        int num_1 = teclado.nextInt();

        System.out.println("Informe o segundo valor: ");
        int num_2 = teclado.nextInt();
        
        if(num_1 > num_2  && num_1 % num_2 == 0){
            System.out.println("Numeros sao multiplos");
        } else if(num_2 > num_1 && num_2 % num_1 == 0){
            System.out.println("Numeros sao multiplos");
        } else{
            System.out.println("Numeros nao sao multiplos");
        }
    }
}