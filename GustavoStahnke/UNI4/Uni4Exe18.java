import java.util.Scanner;

public class Uni4Exe18 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);        

        System.out.println("Informe o dia do vencimento");
        int diaVencimento = input.nextInt();

        System.out.println("Informe o dia do pagamento");
        int diaPagamento = input.nextInt();

        System.out.println("Informe o valor da prestação");
        double valorPrestacao = input.nextDouble();

        int atraso = diaPagamento - diaVencimento;

        if (atraso < 1)
        {
            System.out.println("O pagamento está em dia");
            valorPrestacao = valorPrestacao * .9;
        }
        else if (atraso <= 5)
        {
            System.out.println("Feito com até 5 dias, perdeu o desconto...");
        }
        else
        {
            System.out.println("Feito após 5 dias, taxa de 2% ao dia.");
            valorPrestacao = valorPrestacao * (1 + ((double)(atraso - 5) / 100) * 2);
        }

        System.out.println("Valor da prestação: " + valorPrestacao);

        input.close();
    }
}
