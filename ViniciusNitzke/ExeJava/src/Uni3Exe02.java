import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o preço do par de sapatos: ");
        float par = teclado.nextFloat();

        float desc = (float) (par * 0.12);

        float valorDesc = par - desc;

        System.out.println("O valor do desconto é de R$: "+ valorDesc);

        System.out.println("O preço do par de sapatos com desconto é R$: "+ desc);

    }
}
