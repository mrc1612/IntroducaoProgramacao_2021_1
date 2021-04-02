import java.util.Scanner;

public class Uni3Exe08 {
    /*Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. Considerando que o atendente tem a cotação do dólar, descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa. */

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double dolar;
        double real;
        dolar = teclado.nextDouble();
        /*Cotação atual do dólar 28/03/2021 = R$5,76 */
        real = (dolar * 5.76);
        
        System.out.println("Você trocou " + dolar + " dólares, e recebeu " + real + " reais");
        teclado.close();
    }
}
