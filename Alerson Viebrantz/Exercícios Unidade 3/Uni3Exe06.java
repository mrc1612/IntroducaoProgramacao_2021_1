import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double kg, pesofinal, total;

        System.out.println("O peso do prato será descontado.");
        System.out.println("Informe o peso em kg: (exemplo: 5,780)");
        kg = teclado.nextDouble();

        pesofinal = kg-0.750;
        total = pesofinal*25;

        System.out.println("O preço a pagar é R$"+total+"");

        teclado.close();
    }
}
