import java.util.*;

public class Uni4Exe12 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int lado1;
        int lado2;
        int lado3;
        
        System.out.println("Informe o primeiro cateto: ");
        lado1 = teclado.nextInt();

        System.out.println("Informe o segundo cateto: ");
        lado2 = teclado.nextInt();

        System.out.println("Informe a hipotenusa: ");
        lado3 = teclado.nextInt();
    
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("O triangulo eh equilatero");
        } 
        else if(lado1 == lado2 && lado1 != lado3) 
        {
            System.out.println("O triangulo eh isosceles");
        } 
        else if (lado3 == lado1 && lado1 != lado2) 
        {
         System.out.println("O triangulo eh isosceles");
        }
        else if (lado3 == lado2 && lado2 != lado1) 
        {
        System.out.println("O triangulo eh isosceles!");
        }
        else if (lado1 != lado2 && lado3 != lado1 && lado2 != lado3) 
        {
            System.out.println("O triangulo eh escaleno");
        }
    }
}