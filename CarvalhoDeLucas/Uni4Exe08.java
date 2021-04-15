import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe uma letra: ");
        String letra = teclado.nextLine();

        if (letra.toUpperCase().equals("A") || letra.toUpperCase().equals("E") || letra.toUpperCase().equals("I")
                || letra.toUpperCase().equals("O") || letra.toUpperCase().equals("U")) {
                    System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }

        teclado.close();
    }
}
