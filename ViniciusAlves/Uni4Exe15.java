import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int meses;
        double salario, percentual, valorFinal;

        System.out.println("Informe o seu salário atual: ");
        salario = teclado.nextDouble();

        System.out.println("Informe a quantidade de meses que você foi admitido: ");
        meses = teclado.nextInt();

        if (meses >1 && meses <= 12){

            percentual = 5.0 / 100;

            valorFinal = salario + (percentual * salario);

            System.out.println("O reajuste salarial para este funcionário será: "+ valorFinal);

        } else if (meses >12 && meses <= 48){

            
            percentual = 7.0 / 100;

            valorFinal = salario + (percentual * salario);

            System.out.println("O reajuste salarial para este funcionário é de: " + valorFinal);

        } else {
            System.out.println("Reajuste não calculado");
        }
    }
}