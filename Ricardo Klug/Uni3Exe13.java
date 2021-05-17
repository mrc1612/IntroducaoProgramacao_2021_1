import java.util.Scanner;

public class Uni3Exe13 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);    

        double comprimento = teclado.nextDouble();
        double altura = teclado.nextDouble();
        
        double preco = ((comprimento*altura)/9)*12.59;

        System.out.println("Custo: " + preco);

        teclado.close();
    }

}
