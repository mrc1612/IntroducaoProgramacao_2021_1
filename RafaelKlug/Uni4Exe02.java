import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        //Entrada
        System.out.println("Entre com um valor maior do que 0: ");

        //Processo
        int valor = tec.nextInt();

        if ((valor % 2) == 0) {
            System.out.println("É par");
        }
        else {
            System.out.println("É impar");
        }
        tec.close();
    }
}
