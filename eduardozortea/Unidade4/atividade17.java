package eduardozortea.Unidade4;

import java.util.Scanner;

public class atividade17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double renda = scanner.nextDouble();
        double dependentes = scanner.nextDouble();

        double imposto = 0;

        double desconto = renda * ((dependentes * 2) / 100);
        double valorLiquido = renda - desconto;
       
        if ((valorLiquido / 12) <= 2000) {
            System.out.println("Não paga imposto");
        } 
        else if ((valorLiquido / 12) > 2000 && (valorLiquido / 12) <= 5000) {
            imposto = valorLiquido * 0.05;
            System.out.println("Imposto de " + imposto);
        } 
        else if ((valorLiquido / 12) > 5000 && (valorLiquido / 12) <= 10000) {
            imposto = valorLiquido * 0.1;
            System.out.println("Imposto de " + imposto);
        } 
        else {
            imposto = valorLiquido * 0.15;
            System.out.println("Imposto de " + imposto);
        }

        scanner.close();
    }
}
