import java.util.Scanner;
public class Uni5Exe12 
{
    public static void main(String[] args) 
    {
        int linhas, num = 1;
        System.out.print("Quantas linhas voce deseja para o triangulo de Floyd: ");
        Scanner sc = new Scanner(System.in);
        linhas = sc.nextInt();
        for(int i=1; i<=linhas; i++) // for para continuar ate ter o numero de linhas pedidas pelo usuario
        {
            for(int x=1; x<=i; x++)
            {
                System.out.print("\t" + num); // "\t" eh como se fosse um tab
                num++;
            }
            System.out.println();
        }                
    }    
    
}
