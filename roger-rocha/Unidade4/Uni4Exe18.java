import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Uni4Exe18 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor da prestacao: ");
        float valor = teclado.nextFloat();
        System.out.println("Informe o dia do vencimento da seguinte forma, ex: 10, dia = 10");
        int dataVen = teclado.nextInt();
        System.out.println();
        System.out.println("Informe o dia do pagamento da seguinte forma, ex: 9, dia = 9 ");
        int dataPag = teclado.nextInt();
        
        if(dataPag <= dataVen)
        {
            System.out.println("Pagamento esta em dia foi dado um desconto de 10% na sua fatura, o valor pago ja com o desconto foi de R$: " +(valor - (valor * 0.1)));
        }
        else if(dataPag - dataVen <= 5 && dataPag - dataVen >= 1)
        {
            System.out.println("O pagamento esta atrasado em ate 5 dias apos o vencimento entao nao tera desconto entao permance o valor normal de R$: " +(valor));
        }
        else if(dataPag - dataVen > 5)
        {
            System.out.println("O pagamento esta atrasado em mais de 5 dia entao tem uma multa de 2% por cada dia de atraso, entao o valor pago ja com multa eh de R$: " + (valor+(valor * 0.02 * (dataPag - dataVen))));

        }

    }   
}