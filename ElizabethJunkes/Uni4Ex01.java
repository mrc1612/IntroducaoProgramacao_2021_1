import java.util.*;

public class Uni4Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario_normal, salario_hora, salario_extra, salario_total, valor_hora_extra, qtd_hora_extra, horas_trabalhadas;
        System.out.print("Informe o número de horas trabalhadas: ");
        horas_trabalhadas = teclado.nextDouble();
        System.out.print("Informe o valor do salário por hora: R$ ");
        salario_hora = teclado.nextDouble();
        salario_extra = 0;
        if (horas_trabalhadas <= 160) {
            salario_normal = horas_trabalhadas * salario_hora;
        }
        else {
            salario_normal = 160 * salario_hora;
            qtd_hora_extra = horas_trabalhadas - 160;
            valor_hora_extra = salario_hora + (salario_hora * 50) / 100;
            salario_extra = valor_hora_extra * qtd_hora_extra;
        }
        salario_total = salario_normal + salario_extra;
        System.out.println("O salário total do funcionário acrescido com as horas extras foi de: R$ " + salario_total);;
    }
}
