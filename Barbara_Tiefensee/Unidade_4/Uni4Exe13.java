import java.util.*;

public class Uni4Exe13 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int carta1;
        int carta2;
        int carta3;

        System.out.println("[1] = As");
        System.out.println("[2] = 2");
        System.out.println("[3] = 3");
        System.out.println("[7] = 7");
        System.out.println("[11] = Valete");
        System.out.println("[12] = Dama");
        System.out.println("[13] = Rei");

        System.out.println("Informe o valor das 3 cartas");

        System.out.println("Digite o valor da primerira carta:");
        carta1 = ler.nextInt();

        System.out.println("Digite o valor da segunda carta:");
        carta2 = ler.nextInt();

        System.out.println("Digite o valor da terceira carta:");
        carta3 = ler.nextInt();

        if((carta1 == 1 || carta1 == 2 || carta1 == 3) && 
             (carta2 != 1 && carta2 != 2 && carta2 != 3) && 
               (carta3 != 1 && carta3 != 2 && carta3 != 3)) 
        {
            System.out.println("truco");
        }

        if((carta1 != 1 && carta1 != 2 && carta1 != 3) &&
             (carta2 == 1 || carta2 == 2 || carta2 == 3) &&
               (carta3 != 1 && carta3 != 2 && carta3 != 3)) 
        {
            System.out.println("truco");
        }

        if((carta1 != 1 && carta1 != 2 && carta1 != 3) && 
             (carta2 != 1 && carta2 != 2 && carta2 != 3) && 
               (carta3 == 1 || carta3 == 2 || carta3 == 3)) 
        {
            System.out.println("truco");
        }

        if((carta1 == 1 || carta1 == 2 || carta1 == 3) && 
             (carta2 == 1 || carta2 == 2 || carta2 == 3) &&
               (carta3 != 1 && carta3 != 2 && carta3 != 3)) 
        {
            System.out.println("seis");
        }

        if((carta1 == 1 || carta1 == 2 || carta1 == 3) && (carta2 != 1 && carta2 == 2 && carta2 == 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3)) {
            System.out.println(seis);
        }

        if((carta1 != 1 && carta1 != 2 && carta1 != 3) && 
             (carta2 == 1 || carta2 == 2 || carta2 == 3) &&
               (carta3 == 1 || carta3 == 2 || carta3 == 3))
        {
            System.out.println("seis");
        }

        if(((carta1 == 1 || carta1 == 2 || carta1 == 3) && 
              (carta2 == 1 || carta2 == 2 || carta2 == 3) &
                (carta3 == 1 || carta3 == 2 || carta3 == 3))) 
        {
            System.out.println("Nove");
        }   
    }
}