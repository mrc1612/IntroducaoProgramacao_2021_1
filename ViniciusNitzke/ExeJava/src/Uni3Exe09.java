import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Altura da lata: ");
        float altLata = keyboard.nextFloat();

        System.out.print("Raio da lata: ");
        float raio = keyboard.nextFloat();

        float volume = (float) (3.14 * (raio * raio) * altLata);

        System.out.print("O volume da lata é de: " + volume);
        
        Scanner.close();
    }
}
