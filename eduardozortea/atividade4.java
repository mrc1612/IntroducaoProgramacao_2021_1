package eduardozortea;

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1 = scanner.nextFloat();
        double nota2 = scanner.nextFloat();
        double nota3 = scanner.nextFloat();
        
        double media = ((nota1 * 5.0) + (nota2 * 3.0) + (nota3 * 2.0))/10.0;
        
        System.out.println(media);
    }
}
