/*Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam aumentados em 5% e os das
 posições pares sejam aumentados em 2%. Imprima o vetor resultante. Faça um método para ler os valores, 
 outro para ajustar os valores dentro do vetor e outro para escrever os valores atualizados do vetor.*/
import java.util.Scanner;
public class Uni6Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double v[] = new double [4]; // declaração
        int i; // posição
        double ValorPorcentagem;
        double ValorDescontado;

        //Entrada de dados
        for (i = 0; i<4; i++){
            System.out.println("Informe um número");
            v[i] = ler.nextDouble(); 
        }
       // encontra os impares
        for (i = 0; i<4; i++){
          if(v[i] % 2 != 0) {
              ValorPorcentagem = v[i] * 0.05;
              ValorDescontado = v[i] + ValorPorcentagem;
              System.out.print(" " + ValorDescontado);

            }
        }
        // encontra os pares
        for (i = 0; i<4; i++){
            if(v[i] % 2 == 0) {
                ValorPorcentagem = v[i] * 0.02;
                ValorDescontado = v[i] + ValorPorcentagem;
                System.out.print(" " + ValorDescontado);
  
              }
          
        }
    }
}