import java.util.*;

public class Uni3Exe03 {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner (System.in);
        double precoLitro;
        double valorPagamento; 

        System.out.print("O preço do litro da gasolina: ");
        precoLitro = teclado.nextDouble();

        System.out.print("O valor do pagamento: ");
        valorPagamento = teclado.nextDouble();

        System.out.println("A quantidade de litros comprada é "+ (valorPagamento / precoLitro));




    }
}
