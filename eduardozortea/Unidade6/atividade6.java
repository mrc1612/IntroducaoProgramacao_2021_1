import java.util.Scanner;

public class atividade6 {
     public static void main(String[] args) {
        new atividade6();
    }
  
    public atividade6() {

        Scanner scanner = new Scanner(System.in);

        float numeros[] = readVector();
        boolean found = research(numeros);

        if (found) {
          
            System.out.println("Número existe");
          
        } 
        else {
          
            System.out.println("Número não existe");
          
        }

        scanner.close();
    }

    public float[] readVector() {

        System.out.print("Informe o tamanho do vetor desejado: "); // Valor "N"
        int tamanho = s.nextInt();

        float[] vetor = new float[tamanho];

        for (int indice = 0; indice < tamanho; indice++) {
            System.out.print("Digite um valor real: ");
            vetor[indice] = scanner.nextFloat();
        }

        return vetor;
    }

    public boolean research(float[] vetor) {
      
        System.out.print("Digite um número: ");
        float numero = scanner.nextFloat();

        for (int i = 0; i< vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }

        return false;
    }
}
