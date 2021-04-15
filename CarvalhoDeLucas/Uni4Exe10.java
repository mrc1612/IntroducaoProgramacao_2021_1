import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe a idade de Marquinhos: ");
        int marquinhos = teclado.nextInt();

        System.out.print("Informe a idade de Zezinho : ");
        int zezinho  = teclado.nextInt();

        System.out.print("Informe a idade de Luluzinha: ");
        int luluzinha = teclado.nextInt();

        if (marquinhos < luluzinha && marquinhos < zezinho) {
            System.out.println("Marquinhos é o caçula");
        } else if (luluzinha < marquinhos && luluzinha < zezinho) {
            System.out.println("Luluzinha é o caçula");
        } else {
            System.out.println("Zezinho é o caçula");
        }

        teclado.close();

    }
}
