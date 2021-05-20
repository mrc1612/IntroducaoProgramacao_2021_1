import java.util.Scanner;

public class Uni5Exe06 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        double somaAlturas = 0;

        for (int idx = 0; idx < 20; idx++)
        {
            System.out.print("[" + (idx + 1) + "]Informe a altura: ");
            somaAlturas += input.nextDouble();
        }

        System.out.print("Media das 20 alturas: " + somaAlturas / 20);

        input.close();
    }
}