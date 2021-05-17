import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nota prova 1 ");
        double prova1 = teclado.nextDouble();

        System.out.print("Nota prova 2 ");
        double prova2 = teclado.nextDouble();

        System.out.print("Nota prova 3 ");
        double prova3 = teclado.nextDouble();

        System.out.print("Nota exercícios ");
        double exercicios = teclado.nextDouble();

        double media = (prova1 + prova2 * 2 + prova3 * 3 + exercicios) / 7;

        if (media >= 9) {
            System.out.println("Media " + media);
            System.out.println("Conceito: A");
            System.out.println("Aprovado");
        } else if (media < 9 && media >= 7.5) {
            System.out.println("Media " + media);
            System.out.println("Conceito: B");
            System.out.println("Aprovado");
        } else if (media < 7.5 && media >= 6) {
            System.out.println("Media " + media);
            System.out.println("Conceito: C");
            System.out.println("Aprovado");
        } else if (media < 6 && media >= 4) {
            System.out.println("Media " + media);
            System.out.println("Conceito: E");
            System.out.println("Reprovado");
        } else {
            System.out.println("Media " + media);
            System.out.println("Conceito: F");
            System.out.println("Reprovado");
        }

        teclado.close();
    }
}
