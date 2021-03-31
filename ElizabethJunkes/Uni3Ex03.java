import java.util.*;

public class Uni3Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double preco_litro;
        double pagamento;
        System.out.print("Valor do litro de gasolina: R$ ");
        preco_litro = input.nextDouble();
        System.out.print("Valor do pagamento: R$ ");
        pagamento = input.nextDouble();
        double litro_comprado = pagamento / preco_litro;
        System.out.println("A quantidade de litros comprados foi " + litro_comprado);
    }
}
