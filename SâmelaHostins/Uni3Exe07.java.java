import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double nlata, ngarrafa1, ngarrafa2, quantidade;
        double valorlatas, valorgarrafa1, valorgarrafa2;

System.out.println("Informe o número de latas de 350ml, garrafas de 600ml e garrafas de 2L você comprou");
nlata = ler.nextDouble();
ngarrafa1 = ler.nextDouble();
ngarrafa2 = ler.nextDouble();

valorlatas = (nlata * 0.35);
valorgarrafa1 = (ngarrafa1 * 0.6);
valorgarrafa2 = (ngarrafa2 * 2);

quantidade = (valorlatas + valorgarrafa1 + valorgarrafa2);
System.out.println("Você comprou: " + quantidade + " litros de refrigerante");
    }
}
