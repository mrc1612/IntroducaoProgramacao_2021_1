import java.util.*;

public class Uni3Exe05 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int quantidadeFrango;

        System.out.print("Quantidade de frangos na granja: ");
        quantidadeFrango = teclado.nextInt();

        System.out.print("Valor total dos chips é" + quantidadeFrango * 7 );
    }

}
