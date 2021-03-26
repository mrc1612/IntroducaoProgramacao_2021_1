import java.util.Scanner;

public class Uni3Exec07 {
        public static void main(String[] args) throws Exception {
            Scanner teclado = new Scanner(System.in);
            double lata=0.350;
            double garrafa = 0.600;
            double gbig = 2;
            double qtdlata = 0;
            double qtdgarrafa = 0;
            double qtdgbig = 0;
            /* Variaves dos produtos e tambem a Quantidade de cada Produto*/

            System.out.println("Quantas latas de refrigerante você quer?: ");
            qtdlata = teclado.nextDouble();

            qtdlata = qtdlata*lata;
            //System.out.println("Você possui em Litros: "+qtdlata);
            System.out.println("Quantas garrafas de 600ML você quer?: ");
            qtdgarrafa = teclado.nextDouble();

            qtdgarrafa = qtdgarrafa*garrafa;
            //System.out.println("Você possui em Litros: "+qtdgarrafa);
            System.out.println("E por ultimo. Quantas garrafas de 2Litros você quer?: ");
            qtdgbig = teclado.nextDouble();

            qtdgbig = qtdgbig*gbig;
            //System.out.println("Você possui em Litros: "+qtdgbig);
            System.out.println("Ao total você tem: "+(qtdgbig+ qtdlata+qtdgarrafa)+" Litros");

            teclado.close();

     }
}