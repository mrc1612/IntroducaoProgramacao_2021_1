import java.util.Scanner;

public class Uni5Exe03 {
    public static void main(String[] args) throws Exception {
        
        double soma = 0;
        double numerador = 1;
        for(double denominador=1; denominador<=100; denominador++) {
            soma += (numerador/denominador);
        }
        
        System.out.println("Os 100 termos somados resultam em " +soma);

    }
}
