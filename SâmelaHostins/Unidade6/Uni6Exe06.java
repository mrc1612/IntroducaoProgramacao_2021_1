/*Faça um programa que leia um valor N inteiro. Com base neste valor, crie um vetor do tipo real. 
Em seguida, solicite ao usuário informar essa quantidade N de valores reais para popular o vetor.
 Após ter preenchido o vetor, solicite que o usuário informe um outro valor real. Informe para o
  usuário se este valor informado se encontra cadastrado no vetor. Faça um método para ler o vetor
   e outro, que retorne verdadeiro ou falso, para encontrar o valor.*/
import java.util.Scanner;
public class Uni6Exe06 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int n, i;
        System.out.println("Informe um número");
        n = ler.nextInt(); //leia um valor N inteiro
        int v [] = new int [n]; //Com base neste valor, crie um vetor do tipo real.

        for (i = 0; i< n; i++){
            //Solicite ao usuário informar essa quantidade N de valores reais para popular o vetor
            System.out.println("Informe um número inteiro"); 
            v[i] = ler.nextInt();
        }

        for (i = 0; i< n; i++){
            System.out.print(v[i] + " ");
        }

        //Solicite que o usuário informe um outro valor real
        System.out.println(" ");
        System.out.println("Informe um valor");
        int valor = ler.nextInt();
        boolean valorEncontrado = true;

        //Informe para o usuário se este valor informado se encontra cadastrado no vetor
        for (i = 0; i< n; i++){
            if (v[i] == valor){
                valorEncontrado = true;
            }else{
                valorEncontrado = false;
            }

            if (valorEncontrado == true){
            System.out.println("Este valor se encontra cadastrado no vetor");
            }else{
            System.out.println("Este valor não se encontra cadastrado no vetor");
            }
        }

    }
}
