import java.util.Scanner;
 
public class Uni3Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
 
        float tamanho1 = teclado.nextFloat();
        float tamanho2 = teclado.nextFloat();
 
        System.out.println("Area do terreno: " + (tamanho1 * tamanho2));
 
        teclado.close();
    }
}