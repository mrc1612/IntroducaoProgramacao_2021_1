import java.util.*;

public class Uni4Exe10 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        int marquinhos;
        int zezinho;
        int luluzinha;

        System.out.println("Informe a idade do Marquinhos: ");
        marquinhos = teclado.nextInt();

        System.out.println("Informe a idade do Zezinho: ");
        zezinho = teclado.nextInt();

        System.out.println("Informe a idade da Luluzinha: ");
        luluzinha = teclado.nextInt();

        if (marquinhos < zezinho && marquinhos < luluzinha) 
        {
            System.out.println("Marquinhos eh o cacula");
        } 
        else if(zezinho < luluzinha)
        {
            System.out.println("Zezinho eh o cacula");
        }
        else 
        {
            System.out.println("Luluzinha eh a cacula");
        }
    }
}
