import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
      Scanner ler = new Scanner(System.in);
      double precog, valorg, totalnotanque;
      System.out.println("Informe o preço do litro da gasolina");
      precog = ler.nextDouble();
      System.out.println("Informe o valor do pagamento");
      valorg = ler.nextDouble();
      totalnotanque = (valorg / precog);
      System.out.println("Você conseguiu por no seu tanque " + totalnotanque + " litros.");

    }
}
