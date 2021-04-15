import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe sua renda anual: R$");
        double renda = teclado.nextDouble();

        System.out.print("Informe quantidade de dependentes: ");
        double dependentes = teclado.nextDouble();

        double desconto = renda * ((dependentes * 2) / 100);
        double liquido = renda - desconto;
        double imposto = 0;

        if ((liquido / 12) <= 2000) {
            System.out.println("Não paga imposto");
        } else if ((liquido / 12) > 2000 && (liquido / 12) <= 5000) {
            imposto = liquido * 0.05;
            System.out.println("Imposto de " + imposto);
        } else if ((liquido / 12) > 5000 && (liquido / 12) <= 10000) {
            imposto = liquido * 0.1;
            System.out.println("Imposto de " + imposto);
        } else {
            imposto = liquido * 0.15;
            System.out.println("Imposto de " + imposto);
        }

        teclado.close();

    }
}
