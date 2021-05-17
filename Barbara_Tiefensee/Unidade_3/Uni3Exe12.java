import java.util.*;

public class Uni3Exe12 {
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        String nome;
        int dependente;
        Double horasTotais;

        nome = teclado.nextLine();
        dependente = teclado.nextInt();
        horasTotais = teclado.nextDouble();

        double salario_trabalho = horasTotais * 10.00;
        double salario_dep = dependente * 60.00;
        double salarioDescontado = salario_trabalho - ((0.085 * salario_trabalho) + (0.05 * salario_trabalho));

        System.out.println("Nome: " + nome);
        System.out.println("Salario Bruto: " + (salario_trabalho + salario_dep));
        System.out.println("Salario Liquido: " + (salarioDescontado + salario_dep));
    }
}
