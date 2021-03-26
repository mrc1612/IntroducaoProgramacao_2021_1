import java.util.Scanner;
 
public class Uni3Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        float gasolina = 6;
        float valor = teclado.nextFloat();
        float resultado = valor;
        
 
        System.out.println("O preço do Litro de gasolina é de R$" + gasolina);
        System.out.println("O valor do pagamento é de R$"+ valor);
        System.out.println("Foram abastecidos "+resultado/6+" Litros em seu veiculo");
 
        teclado.close();
    }
}