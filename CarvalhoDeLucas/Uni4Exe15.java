import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantidade de meses trabalhos até o momento: ");
        int meses = teclado.nextInt();

        if (meses >= 1 && meses <= 12) {
            System.out.println("Você irá receber 5% de reajuste");
        } else if (meses >= 13 && meses <= 48) {
            System.out.println("Você irá receber 7% de reajuste");
        }

        teclado.close();
    }
}
