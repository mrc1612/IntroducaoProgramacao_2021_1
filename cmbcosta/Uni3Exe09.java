import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Raio: ");
        double raio = scanner.nextDouble();
        System.out.println("Altura: ");
        double altura = scanner.nextDouble();

        System.out.println("volume: " + (3.14 * Math.pow(raio, 2) * altura));
        
        scanner.close();
    }
}