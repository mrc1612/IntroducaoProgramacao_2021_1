import java.util.Scanner;

public class Uni3Ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        double media;
        System.out.print("Primeira nota do aluno: ");
        n1 = teclado.nextDouble();
        System.out.print("Segunda nota do aluno: ");
        n2 = teclado.nextDouble();
        System.out.print("Terceira nota do aluno: ");
        n3 = teclado.nextDouble();
        media = (n1 * 5 + n2 * 3 + n3 * 2) / 10;
        System.out.println("A média ponderada do aluno é " + media);
    }
}