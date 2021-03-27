import java.util.Scanner;

public class Uni3Exe01 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        double larg = tec.nextDouble();
        double alt = tec.nextDouble();

        double area = larg*alt;

        System.out.println("Área do terreno: " + area);

        tec.close();
    }

}
