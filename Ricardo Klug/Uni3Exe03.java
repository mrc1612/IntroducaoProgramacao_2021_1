import java.util.Scanner;

public class Uni3Exe03 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);       

        double preco_litro = teclado.nextDouble();

        double pagamento = teclado.nextDouble();

        double quantidade_abastecida = pagamento/preco_litro;

        System.out.println("A quantidade abastecida foi: " + quantidade_abastecida);

        teclado.close();
    }

}
