import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o raio da lata");
        double raio = sc.nextDouble();
        System.out.println("Informe a altura da lata");
        double altura = sc.nextDouble();


        double volume = (3.14 *(raio * raio)) * altura;

        System.out.println("O volume da lata é de "+volume);
        sc.close();
    }
}
