
import java.util.Scanner;

public class Uni5Exe03 {

    public static void main(String[] args) throws Exception {

        Scanner  input = new Scanner(System.in);

        double somaSerie = 0;

        for (int idx = 1; idx <= 100; idx++)
        {
            somaSerie += 1 / idx;
        }

        System.out.println("Soma da serie: " + somaSerie);

        input.close();

    }
}