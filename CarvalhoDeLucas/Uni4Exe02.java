import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número inteiro maior que 0: ");
        int num = teclado.nextInt();

        if ((num % 2) == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número impar");
        }

        teclado.close();
    }
}
