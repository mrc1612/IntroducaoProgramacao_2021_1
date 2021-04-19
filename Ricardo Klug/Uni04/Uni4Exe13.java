import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Entrada
        System.out.println("Informe as 3 cartas: ");

        int carta1 = tec.nextInt();
        int carta2 = tec.nextInt();
        int carta3 = tec.nextInt();

        //Processo
        int qtdCartasBoas = 0;

        if (carta1 == 1 || carta1 == 2 || carta1 ==3) {
            qtdCartasBoas++;
        }
        if (carta2 == 1 || carta2 == 2 || carta2 ==3) {
            qtdCartasBoas++;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            qtdCartasBoas++;
        }

        //Saida
        if (qtdCartasBoas == 1) {
            System.out.println("Truco");
        }
        else {
            if (qtdCartasBoas == 2) {
                System.out.println("Seis");
            }
            else {
                if (qtdCartasBoas == 3) {
                    System.out.println("Nove");
                }
            }
        }

        tec.close();
    }
}
