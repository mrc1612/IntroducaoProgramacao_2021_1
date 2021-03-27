import java.util.Scanner;

public class Uni3Exe06 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        float pesoComida, peso;
        System.out.println("Coloque peço do prato em Kg:");
        pesoComida = teclado.nextFloat();
        System.out.println("Deu " + pesoComida + " Kg");
        peso = (float) ((pesoComida - 0.750) * 25);
        System.out.println("O preço do prato deu: R$ " + peso); 
        

    }    
}
