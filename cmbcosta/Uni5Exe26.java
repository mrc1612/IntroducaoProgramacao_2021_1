import java.util.Scanner;
public class Uni5Exe26 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    int i = 1, trecho2 = 0, j = 0;
    int pedagio = 1, distancia, trecho = 0;

        System.out.println("Informe o valor do pedágio que Adolfo se recusa a pagar:");
        int negaAPagar = scanner.nextInt();


        while ( pedagio > 0){
            
          System.out.println("Custo do pedagio " + i);
          pedagio = scanner.nextInt();
          if (pedagio < 0){
            break;
        }

          System.out.println("Distância (em km) percorrida até a parada " +i);
          distancia = scanner.nextInt();

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