package AtividadesFurb;

import java.util.Scanner;

public class Atividade10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro cateto: ");

        double cateto1 = sc.nextDouble();

        System.out.println("Informe o segundo cateto: ");

        double cateto2 = sc.nextDouble();

        double hipotenusa = cateto1 * cateto1 + cateto2 * cateto2;

        hipotenusa = Math.sqrt(hipotenusa);


        System.out.println(hipotenusa);

        sc.close();
    }
    
}
