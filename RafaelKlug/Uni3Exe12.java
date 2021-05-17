import java.util.Scanner;

public class Uni3Exe12 {
    /*Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes. A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário. */

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String nome;
        double nht, salarioT, salarioF, salarioB, salarioL, salarioL1;
        int dep;
        /*nome = nome do funcionário, nht = número de horas trabalhadas, dep = dependentes, salarioT = Salário Trabalho, salarioF = Salário Família, salarioL = Salário Líquido, salarioL1 = Salário Líquido 1 */
        System.out.println("Informe seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Informe o número de horas trabalhadas: ");
        nht = teclado.nextDouble();
        System.out.println("Informe o número de dependentes: ");
        dep = teclado.nextInt();

        salarioT = (10 * nht);

        salarioF = (60 * dep);

        salarioB = (salarioT + salarioF);

        salarioL1 = (salarioT * 0.915);

        salarioL = (salarioL1 * 0.95);

        salarioL = (salarioL + salarioF);

        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Número de horas trabalhadas: " + nht);
        System.out.println("Número de dependentes: " + dep);
        System.out.println("Salário bruto é: R$" + salarioB);
        System.out.println("Salário Liquido é: R$" + salarioL);

        teclado.close();
    }
}
