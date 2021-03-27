import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe02 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);       
        
        DecimalFormat df_2 = new DecimalFormat("0.00");

        double preco_base = tec.nextDouble();

        double desconto = preco_base*0.12;
        double preco_final = preco_base - desconto;

        System.out.println("O valor do desconto é de R$ " + df_2.format(desconto));
        System.out.println("O preço do par de sapatos com desconto é R$ " + df_2.format(preco_final));

        tec.close();
    }

}
