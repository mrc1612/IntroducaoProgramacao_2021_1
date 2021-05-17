import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
int n1, n2;
System.out.println("Informe o número 1");
n1 = ler.nextInt();
System.out.println("Informe o número 2");
n2 = ler.nextInt();
if (n1 > n2) {
System.out.println("O " + n1 + "é maior que " + n2);
} else {
    System.out.println("O " + n2 + " é maior que " + n1);
System.out.println("Entrada Incorreta.");
    }
}
}