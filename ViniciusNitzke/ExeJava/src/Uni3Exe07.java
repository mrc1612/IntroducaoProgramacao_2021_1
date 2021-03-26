import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("350ml: ");
        int lata = keyboard.nextInt();

        System.out.print("600ml: ");
        int garrafa = keyboard.nextInt();

        System.out.print("2L: ");
        int garrafa2 = keyboard.nextInt();

        float calc = (float) ((lata * 0.350) + (garrafa * 0.600) + (garrafa2 * 2.00));

        System.out.print(calc + "0 litros.");
    }
}
