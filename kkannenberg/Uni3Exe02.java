import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Infome o preço do sapato");
        float preco = sc.nextFloat();

        float desconto = (float) 0.12;

        float resultado = preco*desconto;

        System.out.println("O calor do desconto é de R$" + resultado);

        System.out.println("O preço do par de sapatos com desconto é R$" + (preco-resultado));

        sc.close();
    }
}
