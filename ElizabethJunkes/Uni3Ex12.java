import java.util.Scanner;

public class Uni3Ex12 {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        int dep = input.nextInt();
        double total_horas = input.nextDouble();
        double salario_trabalho = (total_horas * 10.00);
        double salario_dep = (dep * 60.00);
        double salarioDescontado = salario_trabalho - ((0.085 * salario_trabalho) + (0.05 * salario_trabalho));
        System.out.println("Nome: " + nome);
        System.out.println("Salario Bruto: " + (salario_trabalho + salario_dep));
        System.out.println("Salario Liquido: " + (salarioDescontado + salario_dep));
    }
}
