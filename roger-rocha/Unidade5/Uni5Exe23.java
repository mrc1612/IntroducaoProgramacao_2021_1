import java.util.Scanner;

public class Uni5Exe23 
{
    //Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas durante o mês,
    // que é igual a 30% de comissão sobre o preço de cada produto vendido. Cada vendedor, em um determinado mês, vende n produtos, onde,
    // para cada produto tem-se o preço unitário e a quantidade vendida. O departamento de pessoal deseja obter um relatório com: nome, total de vendas (em R$)
    // e salário de cada vendedor. Descreva um algoritmo que gere o relatório desejado. Para prosseguir com a entrada de dados o algoritmo deve apresentar a seguinte mensagem:
    //cc “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”. O número de produtos (n) de cada vendedor deve ser informado.
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        String s = "";        
        double precoProduto = 0;
        int unidades = 0;
        double salario = 0;
        double totalVendas = 0;
        
        while(!s.equals("n"))
        {
            System.out.println("deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");        
            s = sc.next();
            if(s.equals("n"))
            {
                break;
            }
            System.out.println("Insira o nome do vendedor:");
            nome = sc.next();
            System.out.println("Quanto custa o preco do produto que esse vendedor vendeu:");
            precoProduto = sc.nextDouble();
            System.out.println("Quantas unidades desse produto o vendedor vendeu:");
            unidades = sc.nextInt();
            salario = (precoProduto * 0.30) * unidades;
            totalVendas = unidades * precoProduto;
            System.out.println("O funcionario: " + nome + " vendeu um total de : " + totalVendas + " reais" + " e o seu salario foi de: " + salario + " reais"); 
        }
          
        
    }    
}
