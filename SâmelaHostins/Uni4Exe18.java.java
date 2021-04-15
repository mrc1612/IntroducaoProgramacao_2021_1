import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception{
    Scanner ler = new Scanner(System.in);
    int dVencida, diaPagamento;
    float valor;
    System.out.println("Informe o valor da prestacao");
    valor = ler.nextFloat();
    System.out.println("Informe o dia do vencimento. Ex: 10, dia = 10");
    dVencida = ler.nextInt();
    System.out.println("Informe o dia do pagamento. Ex: 2, dia = 2");
    diaPagamento = ler.nextInt();
                
                if(diaPagamento <= dVencida){
                    System.out.println("Pagamento esta em dia foi dado um desconto de 10% na sua fatura, ficou: R$" +(valor - (valor * 0.1)));
                }else{ 
                    if(diaPagamento - dVencida <= 5 && diaPagamento - dVencida >= 1){
                    System.out.println("O pagamento esta atrasado em ate 5 dias, o valor ficou: R$" +(valor));
                }else{
                if(diaPagamento - dVencida > 5){
                    System.out.println("O pagamento esta atrasado em mais de 5 dias. Há uma multa de 2% por cada dia de atraso, o valor ficou R$: " + (valor+(valor * 0.02 * (diaPagamento - dVencida))));
                }
            } } } }
