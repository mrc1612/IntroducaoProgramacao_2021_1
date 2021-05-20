import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner (System.in);

        String nome = "";
        double n1 = 0.0, n2 = 0.0, med = 0.0;
        

        while (!nome.equals("fim")) {
            if (nome != "fim") {
            System.out.println("Informe seu nome: (digite 'fim' para finalizar o código)");
            nome = teclado.next();
            System.out.println("Informe a nota 1: ");
            n1 = teclado.nextDouble();
            System.out.println("Informe a nota 2: ");
            n2 = teclado.nextDouble();
                med = (n1 + n2)/2;

            System.out.println("A média de "+nome+" é " +med);
            }
        }
        teclado.close();
    }
}
