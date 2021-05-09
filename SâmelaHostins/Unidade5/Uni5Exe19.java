/*Uma loja de departamentos oferece para seus clientes um determinado desconto 
de acordo com o valor da compra efetuada. O desconto é de 20% caso o valor da 
compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual. Descreva um
 algoritmo que leia o valor da compra e escreva o total a pagar a cada compra. 
 Informe também o valor total recebido pela loja ao final do dia. A leitura deve
  ser finalizada com a leitura 0 para o valor da compra.*/
import java.util.Scanner;
public class Uni5Exe19 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double valor=1;
        double valorComDesconto;
        double valorDeDesconto, valorTotal = 0;

        while (valor !=0){
System.out.println("Informe o valor da compra:");
valor = ler.nextInt();

if (valor <= 500){
    valorDeDesconto = (valor* 0.15);
    valorComDesconto = valor - valorDeDesconto;
    System.out.println("O total a pagar é de: " + valorComDesconto);
    valorTotal += valorComDesconto;
}
if (valor > 500){
    valorDeDesconto = (valor* 0.20);
    valorComDesconto = valor - valorDeDesconto;
    System.out.println("O total a pagar é de: " + valorComDesconto);
    valorTotal += valorComDesconto;
}
    }
    System.out.println("O valor total recebido pela loja hoje foi de: R$" + valorTotal);
}}
