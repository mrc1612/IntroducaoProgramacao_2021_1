import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in);
       double volume, raio, altura;
       System.out.println("Informe o raio e a altura respectivamente da lata de óleo");
       raio = ler.nextDouble();
       altura = ler.nextDouble();
       volume = ((raio*raio) * (altura * 3.14));2
       System.out.println("O volume da lata de óleo é: " + volume);

    }
}
