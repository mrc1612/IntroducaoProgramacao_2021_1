import java.util.Scanner;
public class Uni5Ex26 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int i = 1;
        int trecho = 0;
        int trecho_2 = 0; 
        int c = 0;
        int pedagio = 1;
        int distancia;
        System.out.print("Digite o valor do pedágio: ");
        int negaPagar = teclado.nextInt();
        while ( pedagio > 0) {
          System.out.println("O custo do pedágio é " + i);
          pedagio = teclado.nextInt();
          if (pedagio < 0) {
            break;
          }
          System.out.println("Distância (em km) percorrida até a parada " +i);
          distancia = teclado.nextInt();
          i++;
          c = i -1;
          if (pedagio >= negaPagar) {
              trecho ++;
          } else if (distancia >= 150 && pedagio <= negaPagar) {
          trecho_2++;
          } 
        }
        System.out.println("Há " + trecho + " trechos com valor acima.");
        System.out.println( "Ele parou em " + c + " trechos.");
        System.out.println("Há " + trecho_2 + " trechos acima de 150 km com valores aceitáveis pelo homem.");
    }
}
