/*Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
Imprima quais valores desses informados são maiores que a média dos valores. Faça um método para ler 
os valores, outro para calcular a média e outro para informar os valores maiores que a média.*/
import java.util.Scanner;
public class Uni6Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double v[] = new double [4]; // declaração
        int i; // posição
        double soma = 0;
        double media = 0;

        //Entrada de dados
        for (i = 0; i<4; i++){
            System.out.println("Informe um número");
            v[i] = ler.nextDouble(); 
        }
       // faz somatorio e media
        for (i = 0; i<4; i++){
            soma += v[i];
        }
        media = soma / 4;
       // mostra valor acima da media
        for (i = 0; i<4; i++){
            if (v[i]> media){
                System.out.println("Os valores maiores que a média são: " + v[i]);
            }
        }
    }
}
