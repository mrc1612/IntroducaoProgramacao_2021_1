import java.util.Scanner;

public class Uni3Exe01 {
    
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);        

        double lar = teclado.nextDouble();
        double com = teclado.nextDouble();

        /*váriavel lar = largura
          váriavel com = comprimento*/

        double area = lar*com;

        System.out.println("Área do terreno: " + area);

        teclado.close();
    }

}
