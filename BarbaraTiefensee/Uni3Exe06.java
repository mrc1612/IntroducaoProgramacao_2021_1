import java.util.*;

public class Uni3Exe06 {
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner (System.in);

        double kg; 
        double pesoFinal;
        double valorTotal;

        System.out.print("O peso do prato tem desconto de: ");

        System.out.print("O peso em quilos: ");
        kg = Double.parseDouble(teclado.nextLine());

        pesoFinal = kg * 1;

        valorTotal = 25 * pesoFinal;

        System.out.println("O preço a pagar: R$ " + valorTotal);
    }
}
