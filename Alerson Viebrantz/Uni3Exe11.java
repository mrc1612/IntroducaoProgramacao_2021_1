import java.util.Scanner;


public class Uni3Exe11 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        double celsius, fahrenheit;

        System.out.println("Informe C°:");
        celsius = teclado.nextDouble();

        fahrenheit = 1.8 * celsius + 32;

        System.out.println(""+fahrenheit+" F°");

        teclado.close();
    }
}
