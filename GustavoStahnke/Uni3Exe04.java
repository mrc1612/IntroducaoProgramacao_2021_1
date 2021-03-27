import java.util.Scanner;

public class Uni3Exe04 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);       

        double nota1 = tec.nextDouble();
        double nota2 = tec.nextDouble();
        double nota3 = tec.nextDouble();

        double media_ponderada = (nota1*5 + nota2*3 + nota3*2) / 10;

        System.out.println("A quantidade abastecida foi: " + media_ponderada);

        tec.close();
    }

}
