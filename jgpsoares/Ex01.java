
import java.util.*;

public class Ex01 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Numero da base: ");
        double retanguloBase = teclado.nextDouble();

        System.out.println("Numero da altura: ");
        double retanguloAltura = teclado.nextDouble();

        System.out.println("\n Area total: " + (retanguloBase * retanguloAltura));
    }
}
