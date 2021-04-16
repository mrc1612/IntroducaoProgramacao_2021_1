import java.util.Scanner;


public class Uni3Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lata;
        int garrafa_600ml;
        int garrafa_2L;
        double litros;

        System.out.println("Quantas latas você comprou?");
        lata = teclado.nextInt();
        System.out.println("Quantas garrafas de 600ml você comprou?");
        garrafa_600ml = teclado.nextInt();
        System.out.println("Quantas garrafas de 2L você comprou?");
        garrafa_2L = teclado.nextInt();

        litros = (lata*0.350) + (garrafa_600ml*0.600) + (garrafa_2L*2.000);

        System.out.println("Você comprou "+litros+"L de refrigerante ;b");
    }
}