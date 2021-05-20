import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        float alt = 0;
        float med;

        for (int i=1; i<=20; i++) {
            System.out.println("Informe a sua altura:");
            alt += teclado.nextFloat();
        }    
            med = alt / 20;
            System.out.println("A média de altura das pessoas informadas é de " +med);
        
            teclado.close();
    }
}
