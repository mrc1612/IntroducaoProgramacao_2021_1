import java.util.*;

public class Uni3Exe07 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        double refri350;
        double refri600;
        double refri2L;

        System.out.print("Quantidade do refri de 350 é: ");
        refri350 = teclado.nextDouble();

        System.out.print("Quantidade do refri de 600 é: ");
        refri600 = teclado.nextDouble();

        System.out.print("Quantidade do refri de 2 litros é: ");
        refri2L = teclado.nextDouble();

        System.out.println("O total de litros comprado é" + (refri350 * 0.35 + refri600 * 0.6 + refri2L * 2));
        
    }

    
    
}
