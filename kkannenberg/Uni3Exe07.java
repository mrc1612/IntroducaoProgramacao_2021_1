import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double lata = 0.350;
        double garrafa600 = 0.600;
        double garrafa2 = 2;

        System.out.println("Quantas latas você quer?");
        int lataQTAD = sc.nextInt();
        System.out.println("Quantas garrafas de 600Ml você quer?");
        int garrafa600QTAD = sc.nextInt();
        System.out.println("Quantas garrafas de 2L você quer?");
        int garrafa2QTAD = sc.nextInt();

        double total1 = lataQTAD * lata;
        double total2 = garrafa600 * garrafa600QTAD;
        double total3 = garrafa2 * garrafa2QTAD;

        double resultado = total1+total2+total3;

        System.out.println("Ao total você comprou "+resultado + " Litros de refrigerante" );
        sc.close();
    }
}
