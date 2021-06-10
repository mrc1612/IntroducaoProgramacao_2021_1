import java.util.Scanner;

public class atividade2 {
  
   public static void main(String[] args) {
    new atividade2();
  }

  private atividade2() {
    double vetor[] = new double[12];
    
    readVector(vetor);
    double media = vetorAverage(vetor);
    writeVector(vetor, media);
  }

  private void readVector(double vetor[]) {
    Scanner teclado = new Scanner(System.in);
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("vetor[" + i + "]: ");
      vetor[i] = teclado.nextDouble();
    }
    teclado.close();
  }

  private double vetorAverage(double vetor[]) {
    double vetorSum = 0;
    for (int i = 0; i < vetor.length; i++) {
      vetorSum += vetor[i];
    }
    double vetorMedia = vetorSum / vetor.length;
    return vetorMedia;
  }

  private void writeVector(double vetor[], double media) {
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] > media) {
        System.out.println("Vetor[" + i + "]: " + vetor[i]);
      }
    }
  }
}
