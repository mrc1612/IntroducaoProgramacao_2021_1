import java.util.Scanner;

public class Uni5Exe05 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int valorA = 8;

        System.out.println("Informe a quantidade repeticoes:");
        int repeticoes = input.nextInt();

        for (int idx = 0; idx < repeticoes; idx++)
        {
            if (idx % 2 == 0)
                System.out.print(valorA + " ");
            else
            {
                System.out.print(valorA + 2 + " ");
                valorA *= 2;
            }
        }

        input.close();
    }
}