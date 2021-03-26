import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float nota1 = 5;
        float nota2 = 3;
        float nota3 = 2;
        float media;
        media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
        System.out.println("Sua média é: " + media);
    }
}
