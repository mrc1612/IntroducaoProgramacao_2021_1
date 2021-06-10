import java.util.Scanner;

public class Atividade1 {

  public static void main(String[] args) {
    new Atividade1();
  }
  
  private Atividade1() {
    int vector[] = new int[10];

    readVector(vector);
    vetorImprimirOrdemInversa(vector);
  }
  private void readVector(int vector[]) {
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("Informe o elemento: " + (i + 1));
      vector[i] = scanner.nextInt();
    }
    scanner.close();
  }

  private void vetorImprimirOrdemInversa(int vetor[]) {
    for (int i = vector.length - 1; i >= 0; i--) {
      System.out.println("vetor[" + i + "]: " + vetor[i]);
    }
  }
}
