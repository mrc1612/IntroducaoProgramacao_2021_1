import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe08 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);    

        DecimalFormat df_2 = new DecimalFormat("0.00");

        double dolares = teclado.nextDouble();
        double cotacao_dolar = teclado.nextDouble();

        double reais = dolares*cotacao_dolar;

        System.out.println("A quantidade de reais é R$ " + df_2.format(reais));

        teclado.close();
    }

}
