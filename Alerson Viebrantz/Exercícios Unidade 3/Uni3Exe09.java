import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        double volume, raio, altura, pi = 3.1415;

        System.out.println("Informe o raio da lata de óleo:");
        raio = teclado.nextDouble();
        System.out.println("Informe a altura da lata de óleo:");
        altura = teclado.nextDouble();

        volume = pi*(raio*raio)*altura;

        System.out.println("O volume da lata de óleo é de:"+volume+"");
        
        teclado.close();


        
    }
}
