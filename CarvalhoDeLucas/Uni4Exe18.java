import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dia do vencimento: ");
        int vencimento = teclado.nextInt();

        System.out.print("Dia do pagamento :");
        int pagamento = teclado.nextInt();

        System.out.print("Valor parcela: ");
        double valor = teclado.nextDouble();

        if ((vencimento - pagamento) >= 0) {
            System.out.println("Dia vencimento " + vencimento);
            System.out.println("Dia pagamento " + pagamento);
            System.out.println("Valor da parcela " + (valor - (valor * 0.1)));
        } else if ((vencimento - pagamento) <= -5) {
            System.out.println("Dia vencimento " + vencimento);
            System.out.println("Dia pagamento " + pagamento);
            System.out.println("Valor da parcela " +valor);
        } else {
            System.out.println("Dia vencimento " + vencimento);
            System.out.println("Dia pagamento " + pagamento);
            System.out.println("Valor da parcela " + (valor + (valor * ((pagamento - vencimento) * 0.02))));
        }

        teclado.close();
    }
}
