import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Entrada
        System.out.println("Há quantos mêses você trabalha na empresa:");
        int tempoTrabalho = tec.nextInt();
        System.out.println("Qual o valor do seu salário:");
        double salario = tec.nextDouble();
        double reajuste;



        //Processo
        if (tempoTrabalho <= 12) {
            System.out.println("Seu reajuste sera de 5%");
            reajuste = salario * 1.05;
            System.out.println("O valor do reajuste é de:" + reajuste);
        }
        if (tempoTrabalho > 12 && tempoTrabalho < 48) {
            System.out.println("Seu reajuste sera de 7%");
            reajuste = salario * 1.07;
            System.out.println("O valor do reajuste é de:" + reajuste);
        }

        tec.close();

    }
}

//Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu salário. A empresa irá conceder 5% de reajuste para o funcionário que for admitido há menos de 12 meses. Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste. O seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que o funcionário foi admitido.
