package eduardozortea;

import java.util.Scanner;

public class atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distancia = scanner.nextDouble();
        double tempo = scanner.nextDouble();

        double velocidadeMedia = distancia/tempo;
        double gasolinaGasta = distancia/12;

        System.out.println("velocidade media: " + velocidadeMedia);
        System.out.println("Litros de gasolina gastos: " + gasolinaGasta);

        scanner.close();
    }
}
