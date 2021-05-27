import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int pontos = 0;

        String[] menina = new String[5];
        String[] menino = new String[5];

        System.out.println("Responda só com sim, não ou ind (indiferente)!");

        String[] perguntas = new String[5];

        perguntas[0] = "Gosta de música sertaneja?";
        perguntas[1] = "Gosta de futebol?";
        perguntas[2] = "Gosta de seriados?";
        perguntas[3] = "Gosta de redes sociais?";
        perguntas[4] = "Gosta da Oktoberfest?";

        System.out.println("MENINA");

        for (int i = 0; i <= 4; i++) {

            System.out.print(perguntas[i]);
            menina[i] = teclado.next().toUpperCase();

        }

        System.out.println("MENINO");

        for (int i = 0; i <= 4; i++) {

            System.out.print(perguntas[i]);
            menino[i] = teclado.next().toUpperCase();

        }

        for (int i = 0; i <= 4; i++) {

            if (menina[i].equals(menino[i])) {
                pontos += 3;
            } else if ((menina[i].equals("SIM") && menino[i].equals("NÃO")
                    || (menina[i].equals("NÃo") && menino[i].equals("SIM")))) {
                pontos -= 2;
            } else {
                pontos += 1;
            }

        }

        if (pontos == 15) {
            System.out.println("Casem!");
        } else if (pontos >= 10 && pontos <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (pontos >= 5 && pontos <= 9) {
            System.out.println("Talvez não dê certo :(");
        } else if (pontos >= 0 && pontos <= 4) {
            System.out.println("Vale um encontro.");
        } else if (pontos >= -9 && pontos <= -1) {
            System.out.println("Melhor não perder tempo.");
        } else {
            System.out.println("Vocês se odeiam!");
        }

        teclado.close();

    }
}