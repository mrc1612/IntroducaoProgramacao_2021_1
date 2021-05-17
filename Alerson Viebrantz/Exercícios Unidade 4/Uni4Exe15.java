import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double salario, salariofinal1, salariofinal2;
        int admição;

        System.out.println("Há quantos meses você trabalha na empresa?");
        admição = teclado.nextInt();

        System.out.println("Informe o seu salário:");
        salario = teclado.nextDouble();

        if (admição <= 12) 
        {
            salariofinal1 = salario * 1.05;
            System.out.println("Seu salário com o reajuste é de: R$"+salariofinal1+"");
        } 
        else 
        {
            if (admição > 13 && admição < 48) 
            {
                salariofinal2 = salario * 1.07;
            System.out.println("Seu salário com o reajuste é de: R$"+salariofinal2+"");
            } 
        else {
            System.out.println("Quantidade de meses inserido é inválido");
        }
        }
        teclado.close();
    }
}
