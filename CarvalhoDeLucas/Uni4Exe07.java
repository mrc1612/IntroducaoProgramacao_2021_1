import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o peso da carta em gramas ");
        int peso = teclado.nextInt();

        double preco = 0.45;
        double pesoExtra = 0;
        double precoTotal = 0;

        if (peso > 50) {
            pesoExtra = peso - 50;
            precoTotal = 0.45 + (preco * Math.ceil(pesoExtra / 20)); 
            System.out.println("Preço total é de: R$" + precoTotal);
        } else {
            System.out.println("Preço total é de: R$0.45");
        }

        teclado.close();
    }
}
