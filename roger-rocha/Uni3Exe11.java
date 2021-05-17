import java.util.Scanner;

public class Uni3Exe11 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual temperatura em graus Celsius voce gostaria de converter para Fahrenheit: ");
        float Celsius = teclado.nextFloat();
        float Fahrenheit = (float) (Celsius * 1.8 + 32);
        System.out.println("A temperatura em fahrenheit é: "+ Fahrenheit);
        
    }    
}
