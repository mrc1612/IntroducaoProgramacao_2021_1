import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Horas Tralhadas : " );
        float HorasTrabalhadas = teclado.nextFloat();

        System.out.println("Valor Hora: " );
        double ValorHora = teclado.nextDouble();

        if (HorasTrabalhadas > 160){
            double salario = 160 * ValorHora;
            double HorasExtras = HorasTrabalhadas - 160;
            double ValorHoraExtra = (HorasExtras * ValorHora) + (HorasExtras * ValorHora) * 0.5;
            System.out.println("Seu Salario é:" + (salario + ValorHoraExtra));
        }else {
            double salario;
            salario = HorasTrabalhadas * ValorHora;
            System.out.println("Seu Salario é:" + salario);

        }


        teclado.close();
    }
}