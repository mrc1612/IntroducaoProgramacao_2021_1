import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        float base = teclado.nextFloat();
        float altura = teclado.nextFloat();

        System.out.println("Area do terreno: " + (base * altura));

        teclado.close();
    }
}