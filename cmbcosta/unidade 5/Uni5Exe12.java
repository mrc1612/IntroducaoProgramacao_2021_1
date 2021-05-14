import java.util.Scanner;

public class Uni5Exe12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe a quantidade de linhas:");
    int qtdLinhas = scanner.nextInt();
    int qtdColunas = 1, num = 1;
    for (int i = 1; i <= qtdLinhas; i++) {
            for (int j = 1; j <= qtdColunas; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println("");
            qtdColunas++;
    }

    scanner.close();
  }
}
