import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o total de sua compra: ");
        int preco = teclado.nextInt();
        System.out.println("Digite seu pagamento: ");
        int pagamento = teclado.nextInt();

        int troco = pagamento - preco;

        int notas100 = troco / 100;
        int notas10 = (troco - (notas100*100)) / 10;
        int notas1 = (troco - (notas100*100) - (notas10*10)) / 1;

        System.out.println("Seu troco é: ");
        System.out.println(notas100 + " notas de 100");
        System.out.println(notas10 + " notas de 10");
        System.out.println(notas1 + " notas de 1");

        teclado.close();
    }
}
    