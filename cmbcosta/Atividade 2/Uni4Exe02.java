import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um Número : " );
        double Numero = teclado.nextDouble();

        if(Numero % 2 == 0){
            System.out.println("Número é par:");
        }else {
            System.out.println("Número é Impar:");
        }


        teclado.close();
    }
}