import java.util.*;

public class Uni3Exe08 {
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner (System.in);

        double real;
        double dolar;

        System.out.print("Dolar: ");
        dolar = teclado.nextDouble();

        System.out.print("Real: ");
        real = 5 * dolar;

        System.out.println("O valor que deve ser devolvido: " + real);
    }

}
