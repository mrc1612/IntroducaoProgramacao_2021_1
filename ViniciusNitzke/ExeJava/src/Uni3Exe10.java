import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Digite o cateto 1: ");
    float cateto = keyboard.nextFloat();

    System.out.print("Digite o cateto 2: ");
    float cateto2 = keyboard.nextFloat();

    float hip = ((cateto * cateto) + (cateto2 * cateto2));

    System.out.print("Hipotenusa: " + hip / hip);
    }
}
