import java.util.Scanner;

public class Uni3Exe02 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        float preco;
        System.out.println("Por favor informe o valor do produto: ");
        preco = teclado.nextFloat();
        System.out.println("O valor do desconto é de R$ " + (preco * 0.12));
        System.out.println("O preço do par de sapatos com desconto é R$ " + (preco - (preco * 0.12)));
    }    
}
