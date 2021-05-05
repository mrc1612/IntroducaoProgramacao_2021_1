import java.util.Scanner;

public class Uni5Exe22 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ano atual: ");
        int ano = teclado.nextInt();

        int contAno = 1995;

        double salario = 2000;

        double aumento = 0.015;

        salario = salario + (salario * aumento);

        System.out.println(salario);

        contAno++;

        while (contAno < ano) {

            aumento = aumento * 2;
            System.out.println(aumento);
            salario = salario + (salario * aumento);

            System.out.println(salario);
            

            contAno++;

        }

        System.out.println("Salario atual: R$" + salario);

        teclado.close();

    }
}
