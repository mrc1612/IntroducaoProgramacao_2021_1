import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Entrada
        float numero = tec.nextFloat();
        System.out.print("O número ");

        //Processo
        if (numero - (int) numero != 0.0) {
            System.out.println("Tem casas decimais");
        }
        else {
            System.out.println("Não tem casas decimais");
        }

        tec.close();
    }
}
