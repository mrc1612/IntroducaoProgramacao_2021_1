import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) 
    {
       Scanner teclado = new Scanner(System.in);
       float largura, comprimento;
       System.out.println("Por favor informe as dimensões do terreno");
       largura = teclado.nextFloat();
       comprimento = teclado.nextFloat();
       System.out.println("A área do terreno é: " + (largura * comprimento));

        
    }
}
