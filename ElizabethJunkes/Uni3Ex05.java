import java.util.*;

public class Uni3Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int frangos;
        double total_granja;
        double anel_comum = 4.00;
        double anel_alimento = 3.50 * 2;
        System.out.print("Quantidade de frangos: ");
        frangos = input.nextInt();
        total_granja = frangos * (anel_comum + anel_alimento);
        System.out.println("Gasto total da granja: R$" + total_granja);
    }
}
