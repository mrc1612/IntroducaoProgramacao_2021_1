import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Entrada
        System.out.println("Informe o peso da carta: ");
        int pesoCarta = tec.nextInt();
        double pesoCartaAdiciional = pesoCarta + 0.45;

        //Processo
        if (pesoCarta <= 50) {
            System.out.println("A carta custa R$ 0,45");
        }
        else {
            if (pesoCarta > 50) {
                System.out.println("A carta custa R$ " + pesoCartaAdiciional);
            }
        }
        
        tec.close();
    }
}
