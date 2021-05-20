import java.util.Scanner;

public class Uni5Exe20 {

    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);       

        System.out.print("Informe a massa inicial: ");
        double massaInicial = tec.nextDouble();

        double massa = massaInicial;

        int segundosPercorridos = 0;

        while (massa > .5)
        {
            massa /= 2;

            segundosPercorridos += 50;
        }

        System.out.println("Massa inicial: " + massaInicial);
        System.out.println("Massa final: " + massa);
        System.out.println("Tempo: " + segundosPercorridos + " segundos.");

        tec.close();
    }
}