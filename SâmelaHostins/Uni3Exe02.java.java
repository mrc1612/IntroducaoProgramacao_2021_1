import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double desconto, preco, valorf;
        double porcentagem = 0.12;
        System.out.println("Informe o preço do calçado");
        preco = ler.nextInt();
        desconto = (preco * porcentagem);
        valorf = (preco - desconto);
        System.out.println("O valor do desconto é de: " + desconto);
        System.out.println("O preço do par de sapatos com desconto é R$ " + valorf);
    }
}
