import java.util.Scanner;
public class Uni5Exe13 {
    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor do ôdometro inicial: ");
        int odometroinicial = teclado.nextInt();
        System.out.println("Quantas vezes parou para abastecer?");
        int qtsparada = teclado.nextInt();

        int comb =0;
        int combtotal= 0;

        for (int i=1; i<=qtsparada; i++){
          System.out.println("Valor do odometro na parada " + i);
          int valorodometro = teclado.nextInt();
          System.out.println("Informe a quantidade de combustível abastecido na parada " +i);
          comb = teclado.nextInt();

        combtotal += comb;

    int kmpl = (valorodometro/comb);
    System.out.println("Informe a km obtida por litro nesta parada: "+kmpl );
    }


    System.out.println("Informe o valor do ôdometro final: ");
    int odometrofinal = teclado.nextInt();
    int kmtotal = (odometrofinal - odometroinicial);
    int kmmedia = ( kmtotal/ combtotal);
    System.out.println ("A km média obtida por litro de combustível na viagem foi de: "+kmmedia);

    }
}