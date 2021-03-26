import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float valordokg, kg, valor, peso;
peso = 750;
valordokg = 25;
kg = (peso / 1000);
valor = (valordokg * kg);
        System.out.println("O valor a pagar é R$" +valor);
    }
}
