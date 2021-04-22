import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        int x, y;

        System.out.println("Informe o valor da coordenada X em que o ponto está: ");
        x = teclado.nextInt();
        System.out.println("Informe o valor da coordenada Y em que o ponto está: ");
        y = teclado.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("O ponto está localizado no quadrante 0");
        } 
        else if (x > 0 && y > 0) 
        {
            System.out.println("O ponto está localizado no quadrante 1");
        }
        else if (x > 0 && y < 0) 
        {
            System.out.println("O ponto está localizado no quadrante 2");
        }
        else if (x < 0 && y < 0) 
        {
            System.out.println("O ponto está localizado no quadrante 3");
        }
        else if (x < 0 && y > 0) 
        {
            System.out.println("O ponto está localizado no quadrante 4");
        }
        teclado.close();
    }
}
