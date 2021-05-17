import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int menorIns = 0;
        int maiorIns = 0;
        double menorAltura = 1000000;
        double maiorAlruta = 0;
        int cont = 0;

        int inscricao = -1;
        double altura = 0;
        double media = 0;

        while (inscricao != 0) {

            System.out.print("Inscrição: ");
            inscricao = teclado.nextInt();

            System.out.print("Altura: ");
            altura = teclado.nextDouble();

            if (altura > maiorAlruta && inscricao != 0) {
                maiorAlruta = altura;
                maiorIns = inscricao;
            }

            if (altura < menorAltura && inscricao != 0) {
                menorAltura = altura;
                menorIns = inscricao;
            }

            media += altura;

            cont++;

        }

        media = media / cont;

        System.out.println("Maior atleta: " + maiorIns + " - " + maiorAlruta);
        System.out.println("Menor atleta: " + menorIns + " - " + menorAltura);
        System.out.println("Média: " + media);

        teclado.close();

    }
}
