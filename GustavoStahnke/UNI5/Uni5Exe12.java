import java.util.Scanner;

public class Uni5Exe12 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o tamanho do Triangulo de Floyd: ");
        int tamanho = input.nextInt();

        int valor = 1;

        for (int idx = 1; idx <= tamanho; idx++)
        {
            for (int idx2 = 0; idx2 < idx; idx2++ )
            {
                System.out.print(valor + " ");
                valor++;
            }
            System.out.println("");
                
        }
       
        input.close();
    }
}