import java.util.Scanner;

public class Uni3Exe03 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        float gas, litros, pagamento;
        System.out.println("Por favor me informe o preço da gasosa ");
        gas = teclado.nextFloat();
        System.out.println("Quanto que o senhor vai botar no tanque em R$ ");
        pagamento = teclado.nextFloat();
        litros = pagamento / gas;
        System.out.println("Olha senhor com esta quantia voce consegue colocar " + litros +" litros"); 
                                      
    }   
}
