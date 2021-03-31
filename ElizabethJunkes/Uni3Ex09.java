import java.util.Scanner;

public class Uni3Ex09 {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);
       double volume, raio, altura;
       System.out.println("Informe o raio e a altura da lata de óleo (nessa ordem): ");
       raio = input.nextDouble();
       altura = input.nextDouble();
       volume = ((raio*raio) * (altura * 3.14));
       System.out.println("O volume da lata de óleo é de: " + volume);

    }
}
    
