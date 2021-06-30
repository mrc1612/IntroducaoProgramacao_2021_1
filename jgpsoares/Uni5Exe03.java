import java.util.Scanner;
public class Uni5Exe03 {
    public static void main(String[] args) throws Exception {
      Scanner ler = new Scanner(System.in);
      double precog, valorg, totalnotanque;
      System.out.print("Informe o preço do litro da gasolina: ");
      precog = ler.nextDouble();
      System.out.print("Informe o valor do pagamento: ");
      valorg = ler.nextDouble();
      totalnotanque = (valorg / precog);
      System.out.println("Você conseguiu colocar no seu tanque " + totalnotanque + " litros.");
    }
}