import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Idade da primeira mulher: ");
        int primeira = teclado.nextInt();

        System.out.print("Idade da primeira segunda: ");
        int segunda = teclado.nextInt();

        System.out.print("Idade do primeiro homem: ");
        int primeiro = teclado.nextInt();

        System.out.print("Idade do segundo homem: ");
        int segundo = teclado.nextInt();

        int homemVelho = 0;
        int homemNovo = 0;

        int mulherVelha = 0;
        int mulherNova = 0;

        if (primeira > segunda) {
            mulherVelha = primeira;
            mulherNova = segunda;
        } else {
            mulherVelha = segunda;
            mulherNova = primeira;
        }

        if (primeiro > segundo) {
            homemVelho = primeiro;
            homemNovo = segundo;
        } else {
            homemVelho = segundo;
            homemNovo = primeiro;
        }

        System.out.println("Idade do homem mais velho mais a idade da mulher mais nova é " + (homemVelho + mulherNova));
        System.out.println("Idade do homem mais novo mais a idade da mulher mais velha é " + (homemNovo + mulherVelha));

        teclado.close();

    }
}
