package uni3ex07;
import java.util.Scanner;

public class Uni3Ex07 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double qtd_lata, qtd_garrafa1, qtd_garrafa2;
        double valor_latas, valor_garrafa1, valor_garrafa2;
        System.out.println("Informe o número total de latas de 350ml, garrafas de 600ml e garrafas de 2L que você comprou: ");
        qtd_lata = ler.nextDouble();
        qtd_garrafa1 = ler.nextDouble();
        qtd_garrafa2 = ler.nextDouble();
        valor_latas = (qtd_lata * 0.35);
        valor_garrafa1 = (qtd_garrafa1 * 0.6);
        valor_garrafa2 = (qtd_garrafa2 * 2);
        double qtd = valor_latas + valor_garrafa1 + valor_garrafa2;
        System.out.println("No total, você comprou " + qtd + " litros de refrigerante.");
    }
}
 