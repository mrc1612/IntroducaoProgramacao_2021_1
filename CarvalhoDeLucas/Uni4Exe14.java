import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o mês que você nasceu: ");
        int mes = teclado.nextInt();

        System.out.print("Informe o dia que você nasceu: ");
        int dia = teclado.nextInt();

        if (mes >= 1 && mes <= 12) {

            if (mes == 2 && dia <= 29 && dia >= 1) {
                System.out.println("Data valida!");
            } else if (mes == 4 || mes == 6 || mes == 8 || mes == 10 || mes == 12) {
                if (dia >= 1 && dia <= 30) {
                    System.out.println("Data valida!");
                } else {
                    System.out.println("Data inválida!");
                }
            } else {
                if (dia >= 1 && dia <= 31) {
                    System.out.println("Data valida!");
                } else {
                    System.out.println("Data inválida!");
                }
            }

        } else {
            System.out.println("Data inválida!");
        }

        teclado.close();

    }
}
