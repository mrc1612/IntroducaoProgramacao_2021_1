import java.util.*;

public class Uni3Exe09 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        double volume, raio, altura;

        System.out.println("Coloque o raio e a altura respectivamente da lata de oleo");
 
        raio = teclado.nextDouble();
 
        altura = teclado.nextDouble();
 
        volume = ((raio*raio) * (altura * 3.14));
        System.out.println("O volume da lata de oleo: " + volume);
     }
}
