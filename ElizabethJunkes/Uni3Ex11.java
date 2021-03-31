import java.util.Scanner;

public class Uni3Ex11 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.print("Informe a temperatura em graus celsius: ");
        celsius = input.nextDouble();
        fahrenheit = ((1.8 * celsius) + 32);
        System.out.println("Em fahrenheit, a temperatura é de " + fahrenheit);
    }
}