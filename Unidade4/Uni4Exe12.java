import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Uni4Exe12 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Comprimento do primeiro lado do triangulo:");
        int lado_1 = teclado.nextInt();

        System.out.println("Comprimento do segundo lado do triangulo:");
        int lado_2 = teclado.nextInt();

        System.out.println("Comprimento do terceiro lado do triangulo:");
        int lado_3 = teclado.nextInt();

        if(lado_1 > lado_2 + lado_3 || lado_2 > lado_1 + lado_3 || lado_3 > lado_1 + lado_2) {
            System.out.println("Nao formam um triangulo");
        } else if(lado_1 == lado_2 && lado_1 == lado_3) {
            System.out.println("Triangulo equilatero");
        } else if( (lado_1 == lado_2 && lado_1 != lado_3) || (lado_3 == lado_2 && lado_3 != lado_1) || (lado_1 == lado_3 && lado_1 != lado_2)) {
            System.out.println("Triangulo isoceles");
        } else {
            System.out.println("Triangulo escaleno");
        }
    }
}