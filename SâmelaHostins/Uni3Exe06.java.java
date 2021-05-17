import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double kg, peso, valor;

        System.out.println("Informe o peso em kg");
        kg = ler.nextDouble();

        peso = (kg- 0.750);
valor = (peso * 25);
System.out.println("O preço a pagar é R$"+ valor);

    }
}
