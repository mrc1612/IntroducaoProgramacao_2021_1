import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a nota1");
        double nota1 = scanner.nextFloat();
        System.out.println("Informe a nota2");
        double nota2 = scanner.nextFloat();
        System.out.println("Informe a nota3");
        double nota3 = scanner.nextFloat();
        
        double media = ((nota1 * 5.0) + (nota2 * 3.0) + (nota3 * 2.0))/10.0;
        
        System.out.println(media);

        scanner.close();
    }
}