import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        double kg, peso_final, total;

        System.out.println("Informe o peso em kg: ");
        kg = teclado.nextDouble();

        peso_final = kg-0.750;
        total = peso_final*25;

        System.out.println("O preço do prato é de R$"+total+"");
    }
}