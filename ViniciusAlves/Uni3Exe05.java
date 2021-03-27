import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        float frango;
        double anel1 =4;
        double anel2 =3.5;
        
        {
            System.out.println("Quantos frangos tem a granja?: ");
            frango = teclado.nextFloat();
        }{
            System.out.println("O gasto total da granja é de : "+frango*(anel1+(anel2*2))+" R$");
        }


        teclado.close();
    }
}

