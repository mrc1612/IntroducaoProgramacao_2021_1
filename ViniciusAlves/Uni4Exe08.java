import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        char letra;

        System.out.println("Informe uma letra em minusculo");
        letra= teclado.next().charAt(0);

        if (letra == 'a'|| letra =='e' || letra =='i' || letra =='o' || letra == 'u') {
            System.out.println("A letra " + letra + " é uma vogal!");
        } else {
            System.out.println("A letra " + letra + " é uma consoante!");
        }

    }
}