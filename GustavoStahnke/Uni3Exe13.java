import java.util.Scanner;

public class Uni3Exe13 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);    

        double comprimento = tec.nextDouble();
        double altura = tec.nextDouble();
        
        double preco = ((comprimento*altura)/9)*12.59;

        System.out.println("Custo: " + preco);

        tec.close();
    }

}
