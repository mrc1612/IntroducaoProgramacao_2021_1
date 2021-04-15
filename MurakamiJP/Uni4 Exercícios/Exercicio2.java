import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int valor = scanner.nextInt();

        if(valor % 2 == 0){
            System.out.println("O número é par");
        }
        else{
            System.out.println("O número é impar");
        }

        scanner.close();

    }
}