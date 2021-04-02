import java.util.Scanner;

public class Uni3Exe11 {
    /*Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:°F = (9/5) °C + 32 -- (0 °C × 9/5) + 32 = 32 °F*/

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double tempC, tempF;
        /*tempC = temperatura em Celsius e tempF = temperatura em Fahrenheit */
        System.out.println("Digite a temperatura em Celsius: ");
        tempC = teclado.nextDouble();
        tempF = ((tempC * 9/5) + 32);

        System.out.println("A temperatura em Celsius é: " + tempC + "°C");
        System.out.println("A temperatura em Fahrenheit é: " + tempF + "°F");


        teclado.close();
    }
    
}
