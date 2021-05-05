import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String nome = "";

        while (!nome.equals("fim")) {

            System.out.print("Seu nome: ");
            nome = teclado.next();

            System.out.print("Nota 1: ");
            double nota1 = teclado.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = teclado.nextDouble();

            double media = (nota1 + nota2) / 2;

            System.out.println("Aluno " + nome + " teve média " + media);

        }

        teclado.close();

    }
}
