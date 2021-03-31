import java.util.*;

public class Uni3Exe02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        double descontoSapato = 0;
        double precoSapato = 0; 
          

        System.out.println("O preço do sapato: ");
        precoSapato = teclado.nextDouble();

        System.out.println("O valor do desconto é de R$" + precoSapato * 0.12);

        System.out.println("O preço do par de sapatos com desconto é R$ " + precoSapato * 0.88);
        
         




}
}
