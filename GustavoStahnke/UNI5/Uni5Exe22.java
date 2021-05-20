
import java.util.Scanner;

public class Uni5Exe22 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);     
        
        int ano = 1995;

        System.out.print("Informe o ano atual: ");
        int anoAtual = tec.nextInt();

        double aumento = 1.5;
        double salario = 100;

        while (anoAtual > ano)
        {
            salario *= (1 + (aumento / 100));
            aumento *= 2;
            ++ano;
        }

        System.out.print("Salarioa atual: " + salario);

        tec.close();
    }
}