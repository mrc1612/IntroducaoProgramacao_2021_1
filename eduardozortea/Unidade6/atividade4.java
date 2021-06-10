import java.util.Scanner;

public class Uni6Exe4SemMetodo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      
        int[] vetor1 = new int[5];
      
        int[] vetor2 = new int[5];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite o valor " + (i+1) + " para o vetor 1: ");
            vetor1[i] = s.nextInt();

            System.out.print("Digite o valor " + (i+1) + " para o vetor 2: ");
            vetor2[i] = s.nextInt();
        }

        int[] vetorResultante = new int[5];
        for (int indice = 0; indice < vetorResultante.length; indice++) {
            vetorResultante[indice] = vetor1[indice] + vetor2[indice];
        }

        String conteudoVetor1 = " ", conteudoVetor2 = " ", conteudoVetorResultante = " ";

        for (int indice = 0; indice < vetor1.length; indice++) {
            conteudoVetor1 += "[" + vetor1[indice] + "]";
            conteudoVetor2 += "[" + vetor2[indice] + "]";
            conteudoVetorResultante += "[" + vetorResultante[indice] + "]";
        }
        System.out.println("Vetor1 = " + conteudoVetor1 + 
                "\nVetor2 = " + conteudoVetor2 +
                "\nVetor Resultante = " + conteudoVetorResultante);

        scanner.close();
    }
}
