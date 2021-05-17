import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe05 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);    
        
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int quantidade_frangos = teclado.nextInt();

        double preco_aneis = quantidade_frangos * 11;

        System.out.println("O preço será de : " + df_2.format(preco_aneis));

        teclado.close();
    }

}
