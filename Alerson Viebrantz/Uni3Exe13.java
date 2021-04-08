import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double alt, comp, totalm2, totalcomazul;
        
        System.out.println("Informe a altura da parede:");
        alt = teclado.nextDouble();
        System.out.println("Informe o comprimento da parede:");
        comp = teclado.nextDouble();

        totalm2 = alt * comp;
        totalcomazul = totalm2 * 9 * 12.50;


        System.out.println("Você irá gastar R$"+totalcomazul+" para cobrir sua parede de "+totalm2+" m².");

        teclado.close();

    }
}
