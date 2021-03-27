import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe02 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);       
        
        DecimalFormat decimal = new DecimalFormat("0.00");

        double precoBase = teclado.nextDouble();

        double desconto = precoBase*0.12;
        double precoFinal = precoBase - desconto;

        System.out.println("O valor do desconto é de R$ " + decimal.format(desconto));
        System.out.println("O preço do par de sapatos com desconto é R$ " + decimal.format(precoFinal));

        teclado.close();
    }

}