import java.util.Scanner;

public class Uni5Exe04 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        double dividendo = 3;
        double divisor = 2;
        double soma = 0;
        
        for (int i = 0; i < 20; i++)
        {
            soma += dividendo / divisor;
            dividendo += 2;
            divisor += 2 * (i + 2);
        }

        System.out.println("Soma da algoritmo: " + soma);

        input.close();

    }
}