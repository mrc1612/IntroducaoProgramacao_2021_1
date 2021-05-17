package AtividadesFurb;

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);

            System.out.println("Favor colocar o prato para pesagem");

            double peso = sc.nextDouble();

            int ValorDoKilo = 25;

            if (peso >= 1000 + ValorDoKilo) {

                System.out.println("O valor do seu prato é de: R$" + peso);

                
            } else{

                System.out.println("O valor do prato é de: " + peso);

            }

            sc.close();



    }
    
}
