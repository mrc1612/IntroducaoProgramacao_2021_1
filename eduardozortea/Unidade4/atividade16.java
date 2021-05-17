package eduardozortea.Unidade4;

import java.util.Scanner;

public class atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadeMulher = scanner.nextInt();
        int idadeMulher2 = scanner.nextInt();
        int idadeHomem = scanner.nextInt();
        int idadeHomem2 = scanner.nextInt();

        String somaIdades = "Mais velho com a mais nova: ";

        if(idadeHomem > idadeHomem2 && idadeMulher < idadeMulher2) {
            System.out.println(somaIdades + (idadeHomem + idadeMulher));
            System.out.println("O valor do mais novo com a  mais velha: " + (idadeHomem2 * idadeMulher2));
        }
        else if(idadeHomem > idadeHomem2 && idadeMulher > idadeMulher2) {
            System.out.println(somaIdades + (idadeHomem + idadeMulher2));
            System.out.println("O valor do mais novo com a  mais velha: " + (idadeHomem2 * idadeMulher));
        }
        else if(idadeHomem < idadeHomem2 && idadeMulher < idadeMulher2) {
            System.out.println(somaIdades + (idadeHomem2 + idadeMulher));
            System.out.println("O valor do mais novo com a  mais velha: " + (idadeHomem * idadeMulher2));
        }
        else if(idadeHomem < idadeHomem2 && idadeMulher > idadeMulher2) {
            System.out.println(somaIdades + (idadeHomem2 + idadeMulher2));
            System.out.println("O valor do mais novo com a  mais velha: " + (idadeHomem * idadeMulher));
        }

        scanner.close();
    }
}
