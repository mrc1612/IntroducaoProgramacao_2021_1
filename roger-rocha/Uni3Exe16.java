import java.util.Scanner;

public class Uni3Exe16 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe quanto que deu a sua compra: ");
        int precoCompra = teclado.nextInt();
        System.out.println("Informe com que quantia voce vai pagar a conta: ");
        int precoPago = teclado.nextInt();
        int troco = (precoPago - precoCompra);
        int valor = troco;

        int nota100 = valor / 100;
        valor = valor - (nota100 * 100);

        int nota10 = valor / 10;
        valor = valor - (nota10 * 10);

        int nota1 = valor / 1;
        valor = valor - (nota1 * 1);
        
        System.out.println("O seu troco sera: "+ nota100 +" nota(s) de 100R$, " + nota10 + " nota(s) de 10R$, " + nota1 +" nota(s) de 1R$" );


        
    }    
}
