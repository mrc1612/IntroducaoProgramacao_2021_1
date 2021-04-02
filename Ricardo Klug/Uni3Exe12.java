import java.util.Scanner;

public class Uni3Exe12 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);    

        String nome = teclado.nextLine();
        double num_horas = teclado.nextDouble();
        int num_dependentes = teclado.nextInt();

        double salario_bruto = 10*num_horas + 60*num_dependentes;

        double salario_liquido = (salario_bruto*.915)*.95;

        System.out.println("Nome: " + nome);
        System.out.println("Salário bruto: " + salario_bruto);
        System.out.println("Salário líquido: " + salario_liquido);

        teclado.close();
    }

}
