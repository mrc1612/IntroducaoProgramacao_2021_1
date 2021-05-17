import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperaturaC = scanner.nextDouble();
        double teste = (9.0/5.0);
    
        

        System.out.println("Sua temperatura em F: " + ((teste * temperaturaC) + 32));

        scanner.close();
    }
}