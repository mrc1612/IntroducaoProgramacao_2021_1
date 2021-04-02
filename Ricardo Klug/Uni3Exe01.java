import java.util.Scanner;

public class Uni3Exe01 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);        

        double largura = teclado.nextDouble();
        double altura = teclado.nextDouble();

        double area = largura*altura;

        System.out.println("Área do terreno: " + area);

        teclado.close();
    }

}
