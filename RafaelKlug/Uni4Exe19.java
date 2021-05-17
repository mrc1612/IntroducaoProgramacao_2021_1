import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Entrada
        System.out.println("Informe o valor de X:");
        double x = tec.nextDouble();
        System.out.println("Informe o valor de Y:");
        double y = tec.nextDouble();

        //Processo
        if (x > 0 && y > 0) {
            System.out.println("Está localizado no primeiro quadrante");
        }
        if (x > 0 && y < 0) {
            System.out.println("Está localizado no segundo quadrante");
        }
        if (x < 0 && y < 0) {
            System.out.println("Está localizado no terceiro quadrante");
        }
        if (x < 0 && y > 0) {
            System.out.println("Está localizado no quarto quadrante");
        }
        if (x == 0 && y == 0) {
            System.out.println("Não está localizado em nenhum quadrante");
        }
        
        tec.close();
    }
}


/*Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante ele está localizado
0, se os dois valores forem zero
1, se os dois valores forem positivos
2, se x for positivo e y, negativo
3, se os dois valores forem negativos
4, se x for negativo e y, positivo
*/