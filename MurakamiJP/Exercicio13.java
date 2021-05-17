import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);    

        double l = teclado.nextDouble();
        double h = teclado.nextDouble();
        
        double preco = ((l * h) / 9) * 12.59;

        System.out.println("O custo total será de: " + preco);

        teclado.close();
    }

}
