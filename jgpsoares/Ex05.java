import java.util.*;

public class Ex05 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int frango;
        double totalGranja;
        double anelComum = 4.00;
        double anelAlimento = 3.50 * 2;

        System.out.println("Quantidade de frango: ");
        frango = teclado.nextInt();

        totalGranja = frango * (anelComum + anelAlimento);

        System.out.println("Total da granja: R$" + totalGranja);
    }
}