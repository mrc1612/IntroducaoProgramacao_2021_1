package AtividadesFurb;

import java.util.Scanner;

public class Atividade13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o comprimento: ");

        double comprimento = sc.nextDouble();

        System.out.println("Informe a altura: ");

        double altura = sc.nextDouble();

        double azulejo = 12.50;

        double area = comprimento * altura;

        double valorTotal = (area * 9) * azulejo;

        System.out.println("O valor gasto sera de: " + valorTotal);

        

sc.close();




    }
    
}
