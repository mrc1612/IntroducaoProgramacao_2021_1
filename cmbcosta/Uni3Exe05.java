import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdFrango = scanner.nextInt();

        System.out.println("gasto total: " + ((4.00 + 3.50*2)*qtdFrango));
    
        scanner.close();
    }
}