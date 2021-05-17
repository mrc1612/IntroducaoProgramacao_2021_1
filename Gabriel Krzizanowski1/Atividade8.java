package AtividadesFurb;

import java.util.Scanner;

public class Atividade8 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor em dolares para a conversão: ");

        double valor = sc.nextDouble();

        double dolar = 5.80;

        valor = valor / dolar;

        System.out.println(valor);

        sc.close();



    }
    
}
