import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        boolean cor;

        System.out.println("A cor é azul? Responda com true ou false");

cor = ler.nextBoolean();

if (cor == true) {

    System.out.println("Sim");

}else{

    System.out.println("Não");
    
}
}
    }
