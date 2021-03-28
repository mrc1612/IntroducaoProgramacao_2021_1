package AtividadesFurb;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de frangos contidos na granja: ");

        int quantidade = sc.nextInt();

        double Chip = 4.00;

        double alimento = 7.00;

        double ValorPorFrango = (quantidade * Chip) * alimento;
        
        System.out.println("O valor total de todos os frangos sera de: " + ValorPorFrango);

        sc.close();
    }
    
}
