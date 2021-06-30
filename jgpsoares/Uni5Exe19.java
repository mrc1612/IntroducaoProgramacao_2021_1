import java.util.Scanner;
public class Uni5Exe19 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double valor = 1;
        double valorComDesconto; double valorDeDesconto, valorTotal = 0;
        while (valor !=0){
        System.out.println("Digite o valor total da compra: ");
        valor = ler.nextInt();
        if (valor <= 500){
            valorDeDesconto = (valor* 0.15);
            valorComDesconto = valor - valorDeDesconto;
            System.out.println("O total a pagar é de: " + valorComDesconto);
            valorTotal += valorComDesconto;
        }
        if (valor > 500) {
            valorDeDesconto = (valor* 0.20);
            valorComDesconto = valor - valorDeDesconto;
            System.out.println("O total a pagar é de: " + valorComDesconto);
            valorTotal += valorComDesconto;
        }
            }
            System.out.println("O valor recebido pela loja foi de: R$ " + valorTotal);
   }
}