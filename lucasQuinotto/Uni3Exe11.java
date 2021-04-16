import java.util.Scanner;


public class Uni3Exe11{
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double celsius;
        double fahrenheit;


        System.out.print("Informe C°: ");
        celsius = Double.parseDouble(teclado.nextLine());

        fahrenheit = 1.8 * celsius + 32;

        System.out.println(""+fahrenheit+" F°");
    }
}