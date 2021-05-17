import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o valor de um cateto");
        double cateto1 = sc.nextDouble();
        System.out.println("Inmfome o valor do outro cateto");
        double cateto2 = sc.nextDouble();

        double hipotenusa = cateto1 * cateto1 + cateto2 * cateto2;
        System.out.println("O comprimento da hipotuneusa é "+hipotenusa);
        sc.close();
    }
}
