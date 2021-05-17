import java.util.Scanner;

public class Uni3Exe07 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);    

        int qntd_350ml = teclado.nextInt();
        int qntd_600ml = teclado.nextInt();
        int qntd_2l = teclado.nextInt();

        double total = (qntd_350ml * 0.35) + (qntd_600ml * 0.6) + (qntd_2l * 2);

        System.out.println("O total de litros é : " + total);

        teclado.close();
    }

}
