import java.util.Scanner;

public class Uni4Exe01{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o quanto ganha por hora: R$");
        double salarioHora = teclado.nextDouble();

        System.out.print("Informe as horas trabalhadas: ");
        int horasTrabalhadas = teclado.nextInt();

        double salario = 0;
        int horasExtras = horasTrabalhadas - (40 * 4);

        if (horasTrabalhadas > (40 * 4)) {
            salario = (40 * 4) * salarioHora;
            salario += horasExtras * (salarioHora * 1.5);
            System.out.println("Salario com as horas extras R$" + salario);
        } 

        teclado.close();

    }
    
}