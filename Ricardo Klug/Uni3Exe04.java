import java.util.Scanner;

public class Uni3Exe04 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);       

        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();

        double media_ponderada = (nota1*5 + nota2*3 + nota3*2) / 10;

        System.out.println("A quantidade abastecida foi: " + media_ponderada);

        teclado.close();
    }

}
