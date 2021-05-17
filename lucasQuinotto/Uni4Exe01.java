import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double horastrab, valorhora, salario;

        System.out.println("Infome a quantidade de horas trabalhadas no mês:");
        horastrab = teclado.nextDouble();

        System.out.println("Infome o valor da hora:");
        valorhora = teclado.nextDouble();

        if (horastrab >160) {
           salario = valorhora * 1.5 * horastrab;

        } else {
            salario = valorhora * horastrab;
        }

        System.out.println("Seu salário é de: R$ "+salario+"");
        
    }
}
