import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe10 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);    

        DecimalFormat df_2 = new DecimalFormat("0.00");

        double cateto1 = teclado.nextDouble();
        double cateto2 = teclado.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2, 2));

        System.out.println("A hipotenusa é: " + df_2.format(hipotenusa));

        teclado.close();
    }

}
