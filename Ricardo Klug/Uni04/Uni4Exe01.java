import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);
       
       //Entrada
       System.out.println("Número de horas trabalhadas (mês): ");
       int horasTrabalhadas = tec.nextInt();
       System.out.println("Valor por hora: ");
       double valorHoras = tec.nextInt();

       //Processo
        double salarioTotal = horasTrabalhadas * valorHoras;
        if (horasTrabalhadas > 160){ //hotas extra: 40 semanal * 4 = 160 mês
            int horasExtras = horasTrabalhadas - 160;
            salarioTotal = salarioTotal + (salarioTotal * 0.5);
        }

        //Saida
        System.out.println("Salário total do funcionário: "+ salarioTotal);
        tec.close();

        
    }
}
