/*Astolfo resolveu fazer uma viagem para conhecer o nosso país Ele pretende visitar várias cidades, 
dividindo assim a viagem em vários trechos. Entretanto Astolfo se nega a passar por estradas cujo 
custo do pedágio exceda um determinado valor. Faça um programa que leia inicialmente o valor do 
pedágio ao qual Astolfo se nega a pagar. A seguir leia várias duplas de valores representando 
respectivamente o custo do pedágio e a distância (em Km) do trecho. Calcular e escrever:

    quantos trechos da viagem possuem um valor de pedágio acima do qual Astolfo nega­se a pagar
    quantos trechos foram informados
    quantos trechos acima de 150Km de distância possuem um valor de pedágio que Astolfo concorda em pagar*/

import java.util.Scanner;
public class Uni5Exe26 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
    int i = 1, trecho2 = 0, j = 0;
    int pedagio = 1, distancia, trecho = 0;

        System.out.println("Informe o valor do pedágio que Adolfo se recusa a pagar:");
        int negaAPagar = ler.nextInt();

        //O programa será encerrado ao ser fornecido um valor de pedágio negativo.
        while ( pedagio > 0){
            
          System.out.println("Custo do pedagio " + i);
          pedagio = ler.nextInt();
          if (pedagio < 0){
            break;
        }

          System.out.println("Distância (em km) percorrida até a parada " +i);
          distancia = ler.nextInt();

          i++;
          j = i -1;

          if (pedagio >= negaAPagar){
              trecho ++;
        }
          if (distancia >= 150 && pedagio <= negaAPagar){
          trecho2++;
}}
System.out.println("Há " + trecho + " trechos com valor acima do qual ele nega-se a pagar");
System.out.println( "Ele parou em " + j + " trechos.");
System.out.println("Há " + trecho2 + " trechos acima de 150km com valor aceito por ele");
    
}}
