import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        float area_total;

        System.out.print("IMOBILIARIA INOVALAR\n");
        System.out.print("\n");
        
        System.out.print("Informe a base do Terreno Retangular: ");
        float valor_base = teclado.nextFloat();

        System.out.print("Informe a altura do Terreno Retangular: ");
        float valor_altura = teclado.nextFloat();

        area_total = (valor_base * valor_altura);

        System.out.println("A área do terreno total é: " + area_total);
        
        teclado.close();
    }
}
