import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe09 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);    

        DecimalFormat df_2 = new DecimalFormat("0.00");

        double raio = tec.nextDouble();
        double altura = tec.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("O Volume da lata é " + df_2.format(volume));

        tec.close();
    }

}
