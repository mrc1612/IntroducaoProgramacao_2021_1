import java.util.*;

public class Ex11 {
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.print("Informe a temperatura em graus celsius: ");
        celsius = teclado.nextDouble();

        fahrenheit = ((1.8 * celsius) + 32);

        System.out.println("Em fahrenheit, a temperatura é de " + fahrenheit);;
    }
}