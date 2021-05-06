import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double maximoPedagio = 0;

        int pedagios = 0;
        int acima150 = 0;
        int naoPagar = 0;

        System.out.print("Pedágio máximo: R$");
        maximoPedagio = teclado.nextDouble();

        while (true) {

            System.out.print("Valor do pedágio: R$");
            double pedagio = teclado.nextDouble();

            if (pedagio < 0) {
                break;
            }

            System.out.print("Distancia: Km ");
            double distancia = teclado.nextDouble();

            if (distancia > 150 && pedagio < maximoPedagio) {
                acima150++;
            }

            if (pedagio > maximoPedagio) {
                naoPagar++;
            }

            pedagios++;

        }

        System.out.println(naoPagar + " trecho(s) com valor acima do qual ele nega-se a pagar");
        System.out.println(pedagios + " quantidade de trechos informados");
        System.out.println(acima150 + " trecho(s) acima de 150km com valor aceito por ele");

        teclado.close();

    }
}
