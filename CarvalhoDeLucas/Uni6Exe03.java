import java.util.Scanner;

public class Uni6Exe03 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int[] valor = new int[12];
        double[] aumentado = new double[12];

        for (int i = 0; i < valor.length; i++) {

            System.out.print("Informe um número: ");
            valor[i] = teclado.nextInt();

        }

        for (int i = 0; i < valor.length; i++) {

            if ((i % 2) == 0) {
                aumentado[i] = (valor[i] * 0.02) + valor[i];
            } else {
                aumentado[i] = (valor[i] * 0.05) + valor[i];
            }

        }  

        for (int i = 0; i < valor.length; i++) {

            System.out.println(aumentado[i]);

        }

        teclado.close();

    }

}
