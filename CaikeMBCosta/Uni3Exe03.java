  
import java.util.Scanner;
public class Uni3Exe03 {
    public static void main(String[] args) throws Exception {
      Scanner teclado = new Scanner(System.in);
      double price, value, abastecido;
      System.out.println("Informe o preço do litro da gasolina");
      price = teclado.nextDouble();
      System.out.println("Informe o valor do pagamento");
      value = teclado.nextDouble();
      abastecido = (value / price);
      System.out.println("Você abasteceu " + abastecido + " litros.");

    }
}