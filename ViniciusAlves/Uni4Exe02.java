import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        float num;

        System.out.println("Informe um número");
        num = teclado.nextFloat();
        

        if (num % 2 == 0) {
            System.out.println("Esse número é Par!");
        } else {
            System.out.println("Esse número é Ímpar!");
        }

        teclado.close();

    }
}