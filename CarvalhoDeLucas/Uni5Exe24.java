import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double pesoTotal = 0;
        double pesoGrama = 0;
        double pesoKilo = 0;

        String continuar = "";

        System.out.print("Informe o limite diario em Kg: ");
        pesoTotal = teclado.nextDouble();

        while (true) {

            System.out.print("Informe o peso do peixe em gramas: ");
            pesoGrama = teclado.nextDouble();

            pesoKilo += pesoGrama / 1000;

            System.out.print("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
            continuar = teclado.next();

            if (continuar.equals("n")) {
                break;
            }

            if (pesoKilo > pesoTotal) {
                System.out.println("Limite de peso atingido");
                break;
            }

        }

        System.out.println("Total pescado em Kg: " + pesoKilo);

        teclado.close();

    }
}
