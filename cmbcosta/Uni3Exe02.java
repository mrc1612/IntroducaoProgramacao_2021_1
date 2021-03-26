import java.util.Scanner;
 
public class Uni3Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
 
        float valorDesconto = teclado.nextFloat();
        float total = valorDesconto;
        
 
        System.out.println("O valor do desconto é de R$" + (valorDesconto*0.12));
        System.out.println("O preço do par de sapatos com desconto é R$"+ total*0.88);
 
        teclado.close();
    }
}