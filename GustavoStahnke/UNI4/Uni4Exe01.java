import java.util.Scanner;

public class Uni4Exe01 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe as quantidade de horas trabalhadas: ");
        double horasMes = input.nextDouble();
        System.out.println("Informe o valor das horas: ");
        double valorHora = input.nextDouble();
        double salario = 0;

        if (horasMes <= 160) {
            salario = horasMes * valorHora;
        }

        if (horasMes > 160){
            salario = horasMes * valorHora;
            salario += (horasMes -160) * valorHora*1.5;
            
        }
        

        System.out.println("Salário: " + salario);

        input.close();
    }

}