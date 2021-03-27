import java.util.Scanner;

public class Uni3Exe10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.println("Lado 2: ");
        double lado2 = scanner.nextDouble();
         
        System.out.println("Hipotenusa: " + (Math.sqrt((lado1*lado1)+(lado2*lado2))));
        
        scanner.close();
    }
}