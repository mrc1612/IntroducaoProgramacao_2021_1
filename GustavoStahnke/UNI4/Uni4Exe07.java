import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe07 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        double peso = input.nextDouble();
        double preco = 0;

        if (peso > 50) {

            preco = .45 + (((peso - 50) / 20) * .45);

        } else {

            preco = .45;

        }

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("O selo custará: R$ " + df.format(preco));
        input.close();
    }
}