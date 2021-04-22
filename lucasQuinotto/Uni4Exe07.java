import java.util.Scanner;

import jdk.nashorn.internal.runtime.doubleconv.DoubleConversion;

public class Uni4Exe07 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner (System.in);
        
        double pesocarta, custo;

        System.out.println("Digite o peso da carta: ");
        pesocarta = teclado.nextDouble();

        if (pesocarta > 50) {
            custo = 0.45 + ((pesocarta - 50) /20) * 0.45;
        } else {
            custo = 0.45;
        }

        System.out.println("O valor a pagar é de:R$ "+custo+"");
        
        teclado.close();
    }
    
}
