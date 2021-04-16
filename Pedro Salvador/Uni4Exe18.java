import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Uni4Ex18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor da prestação: ");
        float valor = teclado.nextFloat();
        System.out.print("Informe o dia do vencimento da prestação: ");
        int dataVen = teclado.nextInt();
        System.out.print("Informe o dia do pagamento da prestação: ");
        int dataPag = teclado.nextInt();
        if(dataPag <= dataVen) {
            System.out.println("Um desconto de 10% foi aplicado na sua fatura. O valor a ser pago com o desconto incluso é de: R$ " +(valor - (valor * 0.1)));
        }
        else if(dataPag - dataVen <= 5 && dataPag - dataVen >= 1) {
            System.out.println("O pagamento está atrasado em menos de 5 dias. Logo, o valor permanece o mesmo: R$ " +(valor));
        }
        else if(dataPag - dataVen > 5) {
            System.out.println("O pagamento está atrasado em mais de 5 dias. Logo, o valor a ser pago com a multa inclusa é de: R$ " + (valor+(valor * 0.02 * (dataPag - dataVen))));
        }
    }  
}
