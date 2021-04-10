import java.util.Scanner;


public class Uni3Exe10 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        double hip, catadj, catopo, catres;

        System.out.println("Digite o comprimento do cateto adjacente:");
        catadj = teclado.nextDouble();
        System.out.println("Digite o comprimento do cateto oposto:");
        catopo = teclado.nextDouble();

        catres = (catadj*catadj) + (catopo*catopo);
        hip = Math.sqrt(catres);


        System.out.println("O valor da hipotenusa é: "+hip+"");

        teclado.close();
    }
}
