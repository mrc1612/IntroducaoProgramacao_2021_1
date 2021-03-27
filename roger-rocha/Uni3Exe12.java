import java.util.Scanner;

public class Uni3Exe12 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o nome do funcionário: ");
        String nome = teclado.nextLine();
        System.out.println("Informe quantas horas foram trabalhadas: ");
        int horas = teclado.nextInt();
        System.out.println("Informe o número de dependentes do funcionário: ");
        int dependentes = teclado.nextInt();
        float salarioTrabalho = horas * 10;
        float salarioBruto = ((salarioTrabalho) + (dependentes * 60));
        float salarioLiquido = (float) (salarioBruto - (salarioTrabalho * 0.135));
        System.out.println("O funcionário: " + nome + " Possui um salario bruto de: R$ " + salarioBruto + " e um salario liquido de: R$ " + salarioLiquido);

        
    }  

}
