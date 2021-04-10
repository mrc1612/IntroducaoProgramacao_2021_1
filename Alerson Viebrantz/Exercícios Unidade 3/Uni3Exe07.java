import java.util.Scanner;

import javax.swing.text.GapContent;

public class Uni3Exe07 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double lata, garrafa, garrafa2l, litros;

        System.out.println("Quantas latas de refrigerante você comprou?");
        lata = teclado.nextFloat();
        System.out.println("Quantas garrafas de 600ml de refrigerante você comprou?");
        garrafa = teclado.nextFloat();
        System.out.println("Quantas garrafas de 2L de refrigerante você comprou?");
        garrafa2l = teclado.nextFloat();

        litros = (lata*0.350) + (garrafa*0.600) + (garrafa2l*2.000);

        System.out.println("Você comprou "+litros+" litros de refrigerante.");

        teclado.close();

    }
}
