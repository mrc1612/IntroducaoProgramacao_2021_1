import java.util.Scanner;

public class Uni3Exe10 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        float cateto1, cateto2, hipotenusa;
        System.out.println("SÓ FUNCIONA PARA TRIÂNGULO RETÂNGULO");
        System.out.println("Informe o comprimento dos catetos: ");
        cateto1 = teclado.nextFloat();
        cateto2 = teclado.nextFloat();
        hipotenusa = ((cateto1 * cateto1) + (cateto2 * cateto2));
        System.out.println("O valor da hipotenusa é: " +  Math.sqrt(hipotenusa));
    }    
}
