import java.util.Scanner;

public class Exercicio10{
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o lado 1: ");
        double lado_1 = teclado.nextDouble();
        
        System.out.println("Informe o lado 2: ");
        double lado_2 = teclado.nextDouble();
         
        System.out.println("A Hipotenusa será: " + (Math.sqrt((lado_1*lado_1)+(lado_2*lado_2))));
        
        teclado.close();
    }
}