import java.util.*;

public class Uni3Exe13 {
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);

        double comprimento;
        double azulejos;
        double altura;
        double areaParede;
        double quantiaGasta;

        azulejos = 112.50; 

        System.out.print("Informe o comprimento e a altura total da parede: ");

        comprimento = teclado.nextDouble();
        altura = teclado.nextDouble();

        areaParede = comprimento * altura;
        quantiaGasta = areaParede * azulejos;

        System.out.println("A quantia total a pagar: R$" + quantiaGasta);
    }
}
