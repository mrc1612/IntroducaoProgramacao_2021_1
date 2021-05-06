import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String jogadorD = " Jogador D";
        String jogadorE = " Jogador E";
        
        String primeiro = "";
        String segundo = "";

        int pontosPrimeiro = 0;
        int pontosSegundo = 0;

        int pontoD = 0;
        int pontoE = 0;

        while (true) {

            System.out.print("POnto para D ou E? ");
            String ponto = teclado.next();

            if (ponto.toUpperCase().equals("D")) {
                pontoD++;
            } else {
                pontoE++;
            }

            if (pontoD > pontoE) {
                pontosPrimeiro = pontoD;
                primeiro = jogadorD;

                pontosSegundo = pontoE;
                segundo = jogadorE;
            } else {
                pontosPrimeiro = pontoE;
                primeiro = jogadorE;

                pontosSegundo = pontoD;
                segundo = jogadorD;
            }

            if (pontosPrimeiro >= 21) {

                if ((pontosPrimeiro - pontosSegundo) >= 2) {
                    break;
                }

            }

        }

        System.out.println("Primeiro: " + primeiro + ", com " + pontosPrimeiro + " pontos");
        System.out.println("Segundo: " + segundo + ", com " + pontosSegundo + " pontos");

        teclado.close();

    }
}
