import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Informe a cor:");
        String cor = teclado.nextLine();

        if (cor.equals("azul")) {
            System.out.println("A cor escolhida foi azul");
        }else{
            System.out.println("A cor escolhida não foi azul");
        }
        teclado.close();
    }
}
