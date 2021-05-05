import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = teclado.nextInt();

        for (int i = 0; i < 20; i++) {

            System.out.print(numero + i + " - ");

            if (((numero + i) % 2) == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }

        } 

        teclado.close();

    }
}
