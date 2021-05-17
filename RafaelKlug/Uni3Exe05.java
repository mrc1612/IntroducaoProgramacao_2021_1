import java.util.Scanner;

public class Uni3Exe05 {

    /*Uma granja possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel comum chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.*/

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int QuantidadeFrango;

        QuantidadeFrango = teclado.nextInt();

        float PrecoFrango;

        PrecoFrango = (QuantidadeFrango * 4) + (QuantidadeFrango * 7);

        System.out.println("A granja tem: " + QuantidadeFrango + " frangos");
        System.out.println("O custo da granja é de: R$" + PrecoFrango);
        teclado.close();
    }
}
