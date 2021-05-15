import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) throws Exception {
      Scanner teclado = new Scanner(System.in);    

        String funcionario = teclado.nextLine();
        double horas = teclado.nextDouble();
        int dependentes = teclado.nextInt();

        double bruto = 10 * horas + 60 * dependentes;

        double liquido = (bruto * .915) * .95;
      
        System.out.println("Funcionario: " + nome);
        System.out.println("Salario bruto: " + bruto);
        System.out.println("Salario liquido: " + liquido);

        teclado.close();
    }
}
