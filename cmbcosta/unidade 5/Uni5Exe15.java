  import java.util.Scanner;

public class Uni5Exe15 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    String nome;
    double nota1, nota2, media;

    System.out.println(" nome: ");
    nome = teclado.next();
    while (!nome.equals("fim")) {
      System.out.println(" nota1: ");
      nota1 = teclado.nextDouble();
      System.out.println(" nota2: ");
      nota2 = teclado.nextDouble();
      media = (nota1 + nota2) / 2;
      System.out.println(" Média: " + media);

      System.out.println(" nome: ");
      nome = teclado.next();
    }

    teclado.close();
  }
}