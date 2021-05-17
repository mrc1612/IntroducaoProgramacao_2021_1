import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Infore um número: ");
        int num = teclado.nextInt();

        int cont20 = 0;
        String nomes = "";

        for (int i = 0; i < num; i++){

            System.out.print("Informe sua idade: ");
            int idade = teclado.nextInt();

            System.out.print("Informe seu nome: ");
            String nome = teclado.next();

            if (idade == 18) {
                nomes += nome + "\n";
            }

            if (idade > 20) {
                cont20++;
            }

        }

        System.out.println(nomes);
        System.out.println(cont20);

        teclado.close();

    }
}
