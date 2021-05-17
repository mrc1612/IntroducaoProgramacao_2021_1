import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int num = teclado.nextInt();

        System.out.println("Informe um numero: ");
        int num1 = teclado.nextInt();

        int negativo = 0;
        int cont = 0;
        int total = 0;
        double media = 0;

        for (int i = 0; i < num1; i++) {

            if ((num + i) < negativo) {
                negativo = (num + 1);
            }

            if ((num + i) >= 0) {
                total += (num + i);
                cont++;
            }

        }

        if (negativo == 0) {
            System.out.println("Não teve numero negativo");
        } else {
            System.out.println("Negativo " + negativo);
        }  

        media = total / cont;

        System.out.println("Media " + media);

        teclado.close();

    }
}
