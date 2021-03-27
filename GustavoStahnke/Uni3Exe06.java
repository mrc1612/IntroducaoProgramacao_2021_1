import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe06 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);    
        
        DecimalFormat df_2 = new DecimalFormat("0.00");

        double peso = tec.nextDouble();

        double custo = (peso - 0.75)*25;

        System.out.println("O preço será de : " + df_2.format(custo));

        tec.close();
    }

}
