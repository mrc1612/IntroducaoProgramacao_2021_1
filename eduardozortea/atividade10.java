package eduardozortea;

import java.util.Scanner;

public class atividade10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();
         
        System.out.println("Hipotenusa: " + (Math.sqrt(lado1*lado1)+(lado2*lado2)));
        
        scanner.close();
    }
}