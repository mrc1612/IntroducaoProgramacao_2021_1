package eduardozortea.Unidade4;

import java.util.Scanner;

public class atividade21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso = scanner.nextDouble();
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Magreza");
        } 
        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Saudável");
        } 
        else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } 
        else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } 
        else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II");
        } 
        else {
            System.out.println("Obesidade Grau III");
        }

        scanner.close();
    }
}
