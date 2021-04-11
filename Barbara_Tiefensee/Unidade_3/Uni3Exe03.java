import java.util.*;

public class Uni3Exe03 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        double precolitro;
        double valorPagamento;

        System.out.println("Valor do litro de gasolina: ");
        precolitro = teclado.nextDouble();

        System.out.println("Valor do pagamento: ");
        valorPagamento = teclado.nextDouble();

        double litrosComprados = valorPagamento / precolitro;

        System.out.println("A quantidade de litro comprado: " + litrosComprados);
    }
}
