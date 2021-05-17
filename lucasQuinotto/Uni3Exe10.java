import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        double hipotenusa;
        double cateto_adjacente;
        double cateto_oposto;
        double quadradro_hipotenusa;

        System.out.println("Informe o comprimento do cateto adjacente:");
        cateto_adjacente = teclado.nextDouble();
        System.out.println("Agora, informe o comprimento do cateto oposto:");
        cateto_oposto = teclado.nextDouble();

        quadradro_hipotenusa = (cateto_adjacente * cateto_adjacente) + (cateto_oposto * cateto_oposto);
        hipotenusa = Math.sqrt(quadradro_hipotenusa);

        System.out.println("O valor da hipotenusa é de: "+hipotenusa);
    }
}