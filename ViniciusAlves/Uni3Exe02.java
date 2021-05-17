import java.util.Scanner;
 
public class Uni3Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
 
        float tamanho1 = teclado.nextFloat();
        float resultado = tamanho1;
        
 
        System.out.println("O valor do desconto é de R$" + (tamanho1*0.12));
        System.out.println("O preço do par de sapatos com desconto é R$"+ resultado*0.88);
 
        teclado.close();
    }
}