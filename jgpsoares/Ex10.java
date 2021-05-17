import java.util.*;

public class Ex10 {
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o valor de um cateto: ");
        double cateto1 = teclado.nextDouble();

        System.out.println("Informe o valor do outro cateto: ");
        double cateto2 = teclado.nextDouble();

        double hipotenusa = cateto1 * cateto1 + cateto2 * cateto2;
        System.out.println("O comprimento da hipotuneusa: "+ hipotenusa);
    }
}