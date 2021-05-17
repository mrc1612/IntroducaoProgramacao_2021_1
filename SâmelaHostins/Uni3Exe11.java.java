import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in);
double Cel, Fah;
System.out.println("Informe a temperatura em Celsius");
Cel = ler.nextDouble();
Fah = ((1.8 * Cel) + 32);
System.out.println("Esta temperatura em fahrenheit é: " + Fah );
    }
}
