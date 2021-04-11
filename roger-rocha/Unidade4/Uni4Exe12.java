import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Uni4Exe12 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o comprimento do primeiro lado do triangulo:");
        int lado1 = teclado.nextInt();
        System.out.println("Informe o comprimento do segundo lado do triangulo:");
        int lado2 = teclado.nextInt();
        System.out.println("Informe o comprimento do terceiro lado do triangulo:");
        int lado3 = teclado.nextInt();

        if(lado1 > lado2 + lado3 || lado2 > lado1 + lado3 || lado3 > lado1 + lado2)
        {
            System.out.println("Esses numeros nao formam um triangulo");
        }
        else if(lado1 == lado2 && lado1 == lado3)
        {
            System.out.println("Esse triangulo eh equilatero");
        }
        else if( (lado1 == lado2 && lado1 != lado3) || (lado3 == lado2 && lado3 != lado1) || (lado1 == lado3 && lado1 != lado2))
        {
            System.out.println("Esse triangulo eh isoceles");
        }
        else 
        {
            System.out.println("Esse triangulo eh escaleno");
        }
    }    
}
