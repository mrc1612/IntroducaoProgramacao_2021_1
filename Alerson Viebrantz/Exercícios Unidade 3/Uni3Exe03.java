import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double reais, valor, resultado, litros;
        System.out.println("Quantos reais irá abastecer?");
        reais = teclado.nextDouble();
        System.out.println("Qual o valor do litro do combustível?");
        valor = teclado.nextDouble();

        litros = reais/valor;
        resultado = litros*valor;

        System.out.println("Você irá abastecer "+litros+" litros com o valor de R$ "+resultado+"");

    }
}
