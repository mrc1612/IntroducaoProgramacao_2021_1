package AtividadesFurb;

import java.util.Scanner;

public class Atividade11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor em Celsius para conversao: ");

        double Celsius = sc.nextDouble();

        double Fahrenheit =  Celsius * 1.8 + 32;

        System.out.println("O valor em Fahrenheit é : " + Fahrenheit);

        sc.close();


    }


    
}
