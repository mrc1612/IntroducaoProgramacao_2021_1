import java.util.Scanner;

public class Uni3Exe09 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Altura da lata: ");
        float altura = teclado.nextFloat();
        System.out.println("Raio da lata: ");
        float raio = teclado.nextFloat();
        float volume = (float) (3.14 * (raio * raio) *altura);
        System.out.println("Volume da lata é: " + volume);
    }    
}
