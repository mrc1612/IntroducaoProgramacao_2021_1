import java.util.Scanner;

public class Uni3Exec08 {
        public static void main(String[] args) throws Exception {
            Scanner teclado = new Scanner(System.in);
            double real = 5.80;
            double dolar = 1;
            double conversão = 0;

            System.out.println("Quantos dolares quer converter em Real?:");
            dolar = teclado.nextDouble();

            conversão = dolar*real;
            System.out.println("Você agora tem "+conversão+" Reais");

            teclado.close();

     }
}