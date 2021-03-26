import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
Scanner ler = new Scanner(System.in);
int numerodefrango;
int anelcomchip = 4;
double aneldealimento = 7;
double gastototal;
        System.out.println("Informe o número de frangos de sua granja");
        numerodefrango = ler.nextInt();
        gastototal = ((numerodefrango * anelcomchip) + (numerodefrango *aneldealimento)); 
        System.out.println("O gasto total será de: RS" + gastototal);
        
    }
}
