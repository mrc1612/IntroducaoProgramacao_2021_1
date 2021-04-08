import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        int frango, resultado;
        System.out.println("Informe a quantidade de frangos em sua granja:");
        frango = teclado.nextInt();
        
        resultado = frango*11;
        
        System.out.println("Considerando os anéis que cada frango possue (R$11,00 com 1x chip e 2x alimento), sua granja irá gastar R$"+resultado+"");
        
        teclado.close();
    }
}
