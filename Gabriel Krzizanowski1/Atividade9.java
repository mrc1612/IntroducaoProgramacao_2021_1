package AtividadesFurb;

import java.util.Scanner;

public class Atividade9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do raio: ");

        double raio = sc.nextDouble();

        System.out.println("Informe altura: ");

        double altura = sc.nextDouble();

        double pi = 3.14;

        raio = raio * raio;

        double volume = pi * raio * altura;

        System.out.println(volume);

        sc.close();


        
    }
    
}
