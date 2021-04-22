import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner (System.in);

        int marquinhos, zezinho, luluzinha, caçula=0;

        System.out.println("Informe a idade de Marquinhos: ");
        marquinhos = teclado.nextInt();
        System.out.println("Informe a idade de Zezinho: ");
        zezinho = teclado.nextInt();
        System.out.println("Informe a idade de Luluzinha: ");
        luluzinha = teclado.nextInt();

        if (marquinhos < zezinho && marquinhos < luluzinha) {
            System.out.println("Marquinhos é o caçula!");
        } 
        else {
            if (zezinho < luluzinha) 
            {
                System.out.println("Zezinho é o caçula!");
            }
            else {
            System.out.println("Luluzinha é a caçula!");
        }

    }
}
}

