import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Informe o dia do pagamento: ");
        int diaPagamento = tec.nextInt();
        System.out.println("Informe o dia do vencimento: ");
        int diaVencimento = tec.nextInt();
        System.out.println("Valor da prestação: ");
        double valorPrestacao = tec.nextDouble();

        double valorPago;
        

        //Processo
        if (diaPagamento <= diaVencimento) {
            valorPago = valorPrestacao - (valorPrestacao * 0.10);
            System.out.println("Este é o valor pago: R$" + valorPago);
        }
        int diasAtrasados = diaPagamento - diaVencimento;

        if (diasAtrasados < 0 && diasAtrasados <= 5) {
            System.out.println("Este é o valor pago: R$" + valorPrestacao);
        }
        if (diasAtrasados > 5) {
            valorPago = valorPrestacao * 1.02;
            System.out.println("Este é valor pago: R$" + valorPago);
        }

        tec.close();
    }
}

//Uma loja que trabalha com crediário funciona da seguinte maneira: se o pagamento ocorre até o dia do vencimento, o cliente ganha 10% de desconto e é avisado que o pagamento está em dia. Se o pagamento é realizado até cinco dias após o vencimento o cliente perde o desconto, e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da prestação e calcule o valor a ser pago pelo cliente, exibindo as devidas mensagens. Suponha que todo vencimento ocorre até o dia dez de cada mês e os clientes nunca deixam para pagar no mês seguinte.
