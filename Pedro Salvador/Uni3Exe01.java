import java.util.*;

public class Uni3Exe01 {
    public static void main(String[] args) {

        //double retanguloAltura = 3;
        //double retanguloBase = 2;

        Scanner arriba = new Scanner (System.in);

        System.out.print("Número da base: ");
        double retanguloBase = arriba.nextDouble();

        System.out.print("Número da altura: ");
        double retanguloAltura = arriba.nextDouble();

        System.out.println("\nÁrea total: " + (retanguloBase * retanguloAltura));



    }   
    
    
}
