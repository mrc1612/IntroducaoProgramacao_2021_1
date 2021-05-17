package eduardozortea;

import java.util.Scanner;

public class atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nome = scanner.nextLine();
        double horasTrabalhadas = scanner.nextDouble();
        int dependentes = scanner.nextInt();

        double salarioTrabalho = horasTrabalhadas * 10.00;
        double salarioDependentes = dependentes * 60.00;

        double salarioDescontado = salarioTrabalho - ((0.085 * salarioTrabalho) + (0.05 * salarioTrabalho));

        System.out.println("Nome: " + nome);
        System.out.println("Salario Bruto: " + (salarioTrabalho + salarioDependentes));
        System.out.println("Salario Liquido: " + (salarioDescontado + salarioDependentes));
        
        scanner.close();
    }
}
