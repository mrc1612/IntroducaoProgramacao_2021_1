import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Infome o comprimento do terreno");
        float terreno1 = sc.nextFloat();
        System.out.println("Informe a largura do terreno");
        float terreno2 = sc.nextFloat();

        System.out.println("Área do terreno é:" + (terreno1*terreno2));
        sc.close();
    }
}
