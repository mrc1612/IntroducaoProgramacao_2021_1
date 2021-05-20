
import java.util.Scanner;

public class Uni5Exe31 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        System.out.print("Informe o valor para decompor: ");
        int numero = tec.nextInt();

        int divisor = 2;

        while (numero > 1)
        {
            if (numero % divisor == 0)
            {
                System.out.println(numero + " " + divisor);
                numero /= divisor;
            }
            else
                divisor++;
        }
        
        System.out.println(numero);

        tec.close();
    }
}