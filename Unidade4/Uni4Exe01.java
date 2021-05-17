import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double horas_trab, valor_hora, salario;

        System.out.println("Quantidade de horas trabalhadas mês:");
        horas_trab = teclado.nextDouble();

        System.out.println("Valor da hora:");
        valor_hora = teclado.nextDouble();

        if (horas_trab > 160) {
           salario = valor_hora * 1.5 * horas_trab;

        } else{
            salario = valor_hora * horas_trab;
        }

        System.out.println("O salario e de: R$ " + salario + "");  
    }
}