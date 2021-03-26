import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int largura, comprimento, area;
        System.out.println("Informe a largura do terreno");
        largura = ler.nextInt();
        System.out.println("Informe o comprimento do terreno");
        comprimento = ler.nextInt();
        area = (comprimento * largura);
        System.out.println("A área desse terreno é: " + area);
    }
}
