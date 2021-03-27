import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite em metros a frente do terreno: ");
        float ladofrente = teclado.nextFloat();

        System.out.println("Digite em metros a lado do terreno: ");
        float lado = teclado.nextFloat();

        float area = ladofrente * lado;

        System.out.println("A area do terreno é de: " + area + " metros quadrados");
    }
}
