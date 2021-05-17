import java.util.Scanner;

public class Uni5Exe01 {
public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    for (int quantidade = 0; quantidade < 20; quantidade++) { 
        System.out.println("Digite um número");
        int num = scanner.nextInt();
    
        if (num % 2 == 0 ) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
    
    }
 
    scanner.close();
    }
}
