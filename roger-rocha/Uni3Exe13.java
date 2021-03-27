import java.util.Scanner;

public class Uni3Exe13 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a altura da parede: ");
        float altura = teclado.nextFloat();
        System.out.println("Informe o comprimento da parede: ");
        float comprimento = teclado.nextFloat();
        float area = altura * comprimento;
        float preco =  (float) (area * 112.5);
        System.out.println("O preço para fechar essa parede sera de: " + preco);
            
        
    }    
}
