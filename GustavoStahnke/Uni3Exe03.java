import java.util.Scanner;

public class Uni3Exe03 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);       

        double preco_litro = tec.nextDouble();

        double pagamento = tec.nextDouble();

        double quantidade_abastecida = pagamento/preco_litro;

        System.out.println("A quantidade abastecida foi: " + quantidade_abastecida);

        tec.close();
    }

}
