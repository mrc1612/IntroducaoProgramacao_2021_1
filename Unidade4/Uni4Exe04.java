import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        double num;

        System.out.println("Informe um numero: ");
        num = teclado.nextDouble();

        if(num / 1 == num) {
            System.out.println("O numero :" + num + ", contem casas decimais");
        }else{
            System.out.println("O numero :" + num + ", nao contem casas decimais");
        }
 
        teclado.close();
    }
}