import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        float valor_litros;

        System.out.print("POSTO IPIRANGA");
        System.out.print("\n");
        
        System.out.print("Informe o valor do litro de gasolina: ");
        float valor_gasolina = teclado.nextFloat();

        System.out.print("Informe o valor que deseja abastecer: ");
        float valor_abastecer = teclado.nextFloat();

        valor_litros = (valor_abastecer / valor_gasolina);

        System.out.print("Total de Litros: " + valor_litros);System.out.print("L");
        System.out.print("\n");
        System.out.print("A pagar: R$ " + valor_abastecer);
        
        teclado.close();
    }
}