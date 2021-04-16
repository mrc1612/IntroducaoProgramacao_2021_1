import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        double volume;
        double raio;
        double altura;

        System.out.println("Informe o raio da lata:");
        raio = teclado.nextDouble();
        System.out.println("Agora, informe a altura da lata:");
        altura = teclado.nextDouble();

        volume = 3.1415*(raio*raio)*altura;
        System.out.println("O volume da lata de óleo é de:"+volume+"");

    }
}