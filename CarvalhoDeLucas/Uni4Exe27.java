import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe hora de entrada: ");
        int horaEntrada = teclado.nextInt();

        System.out.print("Informe minuto de entrada: ");
        int minutoEntrada = teclado.nextInt();

        System.out.print("Informe hora de saída: ");
        int horaSaida = teclado.nextInt();

        System.out.print("Informe minuto de saída: ");
        int minutoSaida = teclado.nextInt();

        int horaTotal;
        int minutoTotal;

        double valor;

        if (horaEntrada < horaSaida) {

            horaTotal = horaSaida - horaEntrada;

            if (minutoSaida > minutoEntrada) {
                minutoTotal = minutoSaida - minutoEntrada;
            } else {
                minutoTotal = minutoSaida + (60 - minutoEntrada);
            }

            if (horaTotal == 0 && minutoTotal < 30) {
                horaTotal++;
            }

            if (minutoTotal > 30) {
                horaTotal++;
            }

            switch (horaTotal) {
            case 1:
                valor = 5;
                System.out.println("Valor " + valor);
                break;
            case 2:
                valor = 10;
                System.out.println("Valor " + valor);
                break;
            case 3:
                valor = 17.5;
                System.out.println("Valor " + valor);
                break;
            case 4:
                valor = 25;
                System.out.println("Valor " + valor);
                break;
            default:
                valor = 25 + ((horaTotal - 4) * 10);
                System.out.println("Valor " + valor);
                break;
            }

        } else {

            horaTotal = 24 - (horaEntrada - horaSaida);

            if (minutoSaida > minutoEntrada) {
                minutoTotal = minutoSaida - minutoEntrada;
            } else {
                minutoTotal = minutoSaida + (60 - minutoEntrada);
            }

            if (minutoTotal > 30) {
                horaTotal++;
            }

            valor = 25 + ((horaTotal - 4) * 10);
            System.out.println("Valor " + valor);

        }

        teclado.close();

    }
}
