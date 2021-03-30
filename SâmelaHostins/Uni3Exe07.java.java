import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
double nlata, nGarrafa600, nGarrafa2000, Total; 

         nlata = ler.nextInt();
         nGarrafa600 = ler.nextInt();
         nGarrafa2000 = ler.nextInt();

         Total = (nlata * 350 + nGarrafa600 * 600 + nGarrafa2000 * 2000) /1000;
System.out.println ("Quantidade de Litros: " + Total);
ler.close();
    }
}