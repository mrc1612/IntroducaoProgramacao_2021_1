package eduardozortea;

import java.util.Scanner;

public class atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        int centena = (numero/100) % 10;
        int dezena = (numero/10) % 10;
        int unidade = (numero/1) % 10;

        System.out.println("centena: " + centena + " dezenas: " + dezena + " unidades: " + unidade);
        
        scanner.close();
    }
}
