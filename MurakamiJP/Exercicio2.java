import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        float desconto, valor_total;

        System.out.print("PROMOCÃO 12% OFF");
        System.out.print("\n");
        
        System.out.print("Informe o valor do calçado: ");
        float valor_calcado = teclado.nextFloat();

        desconto = valor_calcado * 12 / 100;
        
        valor_total = valor_calcado - desconto;

        System.out.print("O valor do desconto é: R$ " + desconto);
        System.out.print("\n");
        System.out.print("O preço do par de sapatos com desconto é: R$ " + valor_total);

        teclado.close();
    }
}