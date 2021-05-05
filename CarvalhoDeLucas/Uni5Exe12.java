import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int num = teclado.nextInt();

        System.out.println("Informe um numero: ");
        int num2 = teclado.nextInt();

        int cont = 1;

        for (int i = 0; i < num2; i++) {

            for (int j = 0; j < cont; j++) {

                System.out.print(num);

                num = num + 1;

            }

            System.out.println("");

            cont++;

        }

        teclado.close();

    }
}
