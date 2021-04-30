import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            
        System.out.println("Dia do Vencimento?");
        double vencimento = teclado.nextDouble();

        System.out.println("Dia do Pagamento?");
        double pagamento = teclado.nextDouble();

        System.out.println("Valor da Prestação?");
        double valor = teclado.nextDouble();

        if (pagamento - vencimento <= 5){
            double valorASerPago = valor * 0.1;
            double valorDesconto = valor - valorASerPago;
            System.out.println("valor Com Desconto "+valorDesconto);
        } else if (pagamento >= 15) {
         double diaVencimento = pagamento - vencimento; 
         double valorMulta = diaVencimento * 0.02;  
         double valorPagamento =  valor * valorMulta;
         double valorJuros = valorPagamento + valor;
         System.out.println("Valor Com Juros "+valorJuros);
        }
    }
}