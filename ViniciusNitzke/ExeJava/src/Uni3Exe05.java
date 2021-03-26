import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de frango da granja: ");
        int qtdfrango = teclado.nextInt();

        float calc = (float) ((qtdfrango * 4) + (qtdfrango * 3.50));

        System.out.println("O gasto total da granja é de: " + calc);
    }
    
}
