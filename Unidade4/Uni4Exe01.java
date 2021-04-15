import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite as horas trabalhadas no mês: ");
        float horasMes = teclado.nextFloat();

        System.out.println("Digite o valor/hora: ");
        float valorHora = teclado.nextFloat();

        if (horasMes > 160){
            float calc = horasMes - 160;

            float horaExtra = (float) ((float) calc * (valorHora + (valorHora / 2)));
            
            float salario = ((160 * valorHora) + horaExtra);

            System.out.println("O salario é de: " + salario);
        };
    }
}