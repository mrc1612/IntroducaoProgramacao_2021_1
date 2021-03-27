import java.util.Scanner;

public class Uni3Exe07 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);    

        int qtd_350ml = tec.nextInt();
        int qtd_600ml = tec.nextInt();
        int qtd_2l = tec.nextInt();

        double total = (qtd_350ml * 0.35) + (qtd_600ml * 0.6) + (qtd_2l * 2);

        System.out.println("O total de litros é : " + total);

        tec.close();
    }

}
