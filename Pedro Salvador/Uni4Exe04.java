import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

       double numero;

        System.out.println("Informe um numero");

        numero= ler.nextDouble();

if (numero % 1 == 0) {

    System.out.println("O numero " + numero + " não possui casas decimais");

}else {

    System.out.println("O numero " + numero + " possui casas decimais");
    
}
    }
}
