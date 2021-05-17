import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double horas_mes = scanner.nextDouble();
        double ganhos_hora = scanner.nextDouble();

        double horas_sem = horas_mes / 4;

        double salario = 0;

        if(horas_sem > 40){
            
            double ganhos_hora_extra = (horas_mes - 160) * ((ganhos_hora * 0.5) + ganhos_hora);
            salario = ganhos_hora * horas_mes + ganhos_hora_extra;
            System.out.println("O salario total será: " + salario);
            scanner.close();
        }
        else{
            
            salario = ganhos_hora * horas_mes;
            System.out.println("O salario total será: " + salario);
            scanner.close();
        }
    }
}
