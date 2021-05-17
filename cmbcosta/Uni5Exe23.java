import java.util.Scanner;

public class Uni5Exe23 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        String sim = "";        
        double precoProduto = 0;
        int unidades = 0;
        double salario = 0;
        double totalVendas = 0;
        
        while(!sim.equals("n"))
        {
            System.out.println("deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");        
            sim = scanner.next();
            if(sim.equals("n"))
            {
                break;
            }
            System.out.println("Insira o nome do vendedor:");
            nome = scanner.next();
            System.out.println("Quanto custa o preco do produto que esse vendedor vendeu:");
            precoProduto = scanner.nextDouble();
            System.out.println("Quantas unidades desse produto o vendedor vendeu:");
            unidades = scanner.nextInt();
            salario = (precoProduto * 0.3) * unidades;
            totalVendas = unidades * precoProduto;
            System.out.println("O funcionario: " + nome + " vendeu um total de : " + totalVendas + " reais" + " e o seu salario foi de: " + salario + " reais"); 
        }
          
        scanner.close();
    }    
}