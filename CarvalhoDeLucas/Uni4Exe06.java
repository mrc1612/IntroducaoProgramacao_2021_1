import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um caracter: ");
        String letra = teclado.nextLine();

        if (letra.toUpperCase().equals("M")) {
            System.out.println("Masculino");
        } else if (letra.toUpperCase().equals("F")) {
            System.out.println("Feminino");
        } else if (letra.toUpperCase().equals("I")) {
            System.out.println("Não informado");
        } else {
            System.out.println("Entrada incorreta");
        }

        teclado.close();
    }
}
