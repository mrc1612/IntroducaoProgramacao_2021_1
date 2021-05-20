import java.util.Scanner;

import jdk.nashorn.internal.runtime.doubleconv.DoubleConversion;

public class Uni5Exe14 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        
        String prod = "";
        Double valorprod;

        for(int i=1; i<=20; i++){
            System.out.println("Informe o produto: ");
            prod = teclado.nextLine();
            System.out.println("Informe o valor do produto: R$");
            valorprod = teclado.nextDouble();



        }

    }
}
