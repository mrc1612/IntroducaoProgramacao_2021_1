import java.util.*;

public class Uni3Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Base do terreno: ");
        double retangulo_base = teclado.nextDouble();
        System.out.print("Altura do terreno: ");
        double retangulo_altura = teclado.nextDouble();
        System.out.println("Área total do terreno: " + (retangulo_base * retangulo_altura));
    }
}
   
