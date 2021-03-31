import java.util.Scanner;

public class Uni3Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double l1 = input.nextDouble();
        double l2 = input.nextDouble();
        double calculo = (Math.sqrt(l1 * l1) + (l2 * l2));
        System.out.println("O valor da hipotenusa é de " + calculo);
    }
}

