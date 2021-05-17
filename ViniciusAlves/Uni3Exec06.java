import java.util.Scanner;

public class Uni3Exec06 {
        public static void main(String[] args) throws Exception {
            Scanner teclado = new Scanner(System.in);
            double KG = 25;
            double peso = 0;
            double pagar = 0;

            System.out.println("Coloque o peso em KG");
            peso = teclado.nextDouble();

            pagar = peso * KG;

            System.out.println("O valor a pagar "+ pagar+" R$");

            teclado.close();

     }
}