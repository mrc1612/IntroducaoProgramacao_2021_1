import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Valor do litro da gasolina: ");
        float valorLitro = teclado.nextFloat();

        System.out.println("Valor do pagamento: ");
        float valorPagamento = teclado.nextFloat();

        float conta = (valorPagamento/valorLitro);
        
        System.out.println(conta + " litros.");
    }
}
