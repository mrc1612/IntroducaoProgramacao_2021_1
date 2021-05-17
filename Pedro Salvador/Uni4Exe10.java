import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in);
       int ida1, ida2, ida3;
        System.out.println("Informe a idade de Marquinhos");
        ida1 = ler.nextInt();
        System.out.println("Informe a idade de Zezinho ");
        ida2 = ler.nextInt();
        System.out.println("Informe a idade de Luluzinha ");
        ida3 = ler.nextInt();

        if (ida1 < ida2 && ida1< ida3){
            System.out.println("Marquinhos é o caçula da familia");
        }else{
            if (ida2 < ida1 && ida2< ida3){
                System.out.println("Zezinho é o caçula da familia");
        }else{
            System.out.println("Luluzinha é o caçula da familia");
        }
    }
}
