import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int cont10 = 0;
        int cont20 = 0;
        int cont20mais = 0;

        double totalCompra = 0;
        double totalVenda = 0;
        double totalLucro = 0;

        for (int i = 0; i < 20; i++) {

            System.out.print("Preço de compra da mercadoria " + (i + 1) + ": ");
            double pc = teclado.nextDouble(); 

            System.out.print("Preço de venda da mercadoria " + (i + 1) + ": ");
            double pv = teclado.nextDouble(); 

            double percentual = (pv - pc) / (pc * 100);

            if (percentual < 10) {
                cont10++;
            } else if (percentual > 20) {
                cont20mais++;
            } else {
                cont20++;
            }

            totalCompra += pc;
            totalVenda += pv;
            totalLucro += pv - pc;

        }

        System.out.println("< 10%: " + cont10);
        System.out.println("10% <=  <= 20%: " + cont20);
        System.out.println("> 20%: " + cont20mais);

        System.out.println("Total compra " + totalCompra);
        System.out.println("Total venda " + totalVenda);
        System.out.println("Total lucro " + totalLucro);

        teclado.close();

    }
}
