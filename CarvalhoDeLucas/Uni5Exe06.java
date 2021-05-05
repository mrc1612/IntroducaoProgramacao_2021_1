import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double total = 0;

        for (int i = 0; i < 20; i++) {

            System.out.println("Informe uma altura: ");
            double altura = teclado.nextDouble();

            total += altura;

        }

        System.out.println("Média: " + (total / 20));

        teclado.close();

    }
}
