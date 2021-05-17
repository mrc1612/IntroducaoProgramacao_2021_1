import java.util.Scanner;

public class Uni5Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont = 0;
        int num = 1;

        while (cont < 10) {

            for (int i = 0; i <= 1000; i++) {

                int resultado = num + i;

                String valor = String.valueOf(num) + String.valueOf(i);
                
                if (valor.equals(String.valueOf((int)Math.pow(resultado, 2)))) {
                    System.out.println(valor);
                    cont++;
                }

            }

            num++;

        }

        teclado.close();

    }
}
