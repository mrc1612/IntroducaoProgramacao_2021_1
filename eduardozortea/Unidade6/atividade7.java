import java.util.Scanner;

public class atividade7 {

  public static void main(String[] args) {
    new atividade7();
  }
  
  private atividade7() {
    Scanner teclado = new Scanner(System.in);
    int vetQtd;
    do {
      System.out.println("Informe qtd. vetor: ");
      vetQtd = teclado.nextInt();
    } while (vetQtd < 1 || vetQtd > 20);
    
    int vet[] = new int[vetQtd];
    
    vetInserir(vet, teclado);
    vetOrdenar(vet);
    vetImprimir(vet);
    
    teclado.close();
  }
  
  private void vetInserir(int vet[], Scanner teclado) {
    int valor = 0;
    System.out.println("Informe vet[" + 0 + "]:  ");
    valor = teclado.nextInt();
    vet[0] = valor;
    int posFim = 1;

    while (posFim < vet.length) {
      System.out.println("Informe vet[" + posFim + "]:  ");
      valor = teclado.nextInt();
      int j = 0;
      while (j < posFim) {
        if (valor == vet[j]) {
          break;
        }        
        j++;
      }
      if (j == posFim) { 
        vet[posFim] = valor;
        posFim++;
      }
    }
  }

  private void vetOrdenar(int vet[]) {
		int bolha;
		for (int i = 0; i < vet.length - 1; i++) {
			if (vet[i] > vet[i + 1]) {
				bolha = vet[i];
				vet[i] = vet[i + 1];
				vet[i + 1] = bolha;
				i = -1;
			}
		}
  }
  private void vetImprimir(int vet[]) {
    for (int i = 0; i < vet.length; i++) {
      System.out.println("vet[" + i + "]: " + vet[i]);
    }
  }
}
