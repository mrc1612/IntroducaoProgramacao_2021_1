import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        char gen;

        System.out.println("Entre com a inicial do gênero: M para Masculino, F para Feminino e I para Não informado.");
        gen = teclado.next().charAt(0);

        if (gen == 'M' ) {
            System.out.println("Masculino.");
        } else if (gen == 'F') {
            System.out.println("Feminino.");
        } else if (gen == 'I') {
            System.out.println("Não informado.");
        } else {
            System.out.println("Entrada Incorreta.");
        }

    }
}