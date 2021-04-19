import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        // Entrada
        System.out.println("Digite o dia: ");
        int dia = tec.nextInt();
        System.out.println("Digite o mês: ");
        int mes = tec.nextInt();
        System.out.println("Digite o ano: ");
        int ano = tec.nextInt();

        // Processo
        boolean diasTrinta = dia <= 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11);
        boolean diasTrintaUm = dia <= 31
                && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12);

        // Meses
        boolean mesOK = mes >= 1 && mes <= 12;

        // ano bissexto
        boolean bissextoAno = (ano % 4 == 0) && !(ano % 100 == 0 && ano % 400 != 0);
        boolean bissexto = mes == 2 && ((dia <= 28) || (dia <= 29 && bissextoAno));

        boolean dataValida = (mesOK && diasTrinta || mesOK && diasTrintaUm || bissexto);

        // Saída
        if (dataValida && ano > 0 && dia >= 1) {
            System.out.println("Data válida.");
        } else {
            System.out.println("Data NÃO válida.");
        }

        tec.close();
    }
}