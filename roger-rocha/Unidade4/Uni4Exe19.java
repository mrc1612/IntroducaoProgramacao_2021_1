import java.util.Scanner;

public class Uni4Exe19 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de x: ");
        int xvariavel = teclado.nextInt();
        System.out.println("Informe o valor de y: ");
        int yvariavel = teclado.nextInt();
        String ponto = "O ponto esta localizado no quadrante";

        if(xvariavel == 0 && yvariavel == 0)
        {
            System.out.println(ponto + " 0");
        }
        else if(xvariavel > 0 && yvariavel > 0)
        {
            System.out.println(ponto + " 1");
        }
        else if(xvariavel > 0 && yvariavel < 0)
        {
            System.out.println(ponto +" 2");
        }
        else if(xvariavel < 0 && yvariavel < 0)
        {
            System.out.println(ponto + " 3");
        }
        else if(xvariavel < 0 && yvariavel > 0)
        {
            System.out.println(ponto + " 4");
        }
    }    
}
