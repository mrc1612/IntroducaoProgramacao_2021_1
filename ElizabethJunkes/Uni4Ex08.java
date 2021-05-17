import java.util.Scanner;

public class Uni4Ex08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String letra;
        System.out.print("Digite uma letra: ");
        letra = teclado.next();
        if ("a".equals(letra)) {
            System.out.println("É uma vogal.");
        }
        else if ("e".equals(letra)) {
            System.out.println("É uma vogal.");
        }
        else if ("i".equals(letra)) {
            System.out.println("É uma vogal.");
        }
        else if ("o".equals(letra)) {
            System.out.println("É uma vogal.");
        }
        else if ("u".equals(letra)) {
            System.out.println("É uma vogal.");
        }
        else {
            System.out.println("É uma consoante.");
        }
    }
}