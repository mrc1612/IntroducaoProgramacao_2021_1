import java.util.Scanner;

public class Uni3Exe03 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);       

        double precoGasolina = teclado.nextDouble();

        double pagamento = teclado.nextDouble();

        double litros = pagamento/precoGasolina;

        System.out.println("Você encheu o tanque com: " + litros + " litros");

        teclado.close();
    }

}