/*Uma grande loja de departamentos paga aos vendedores um salário com base nas 
vendas efetuadas durante o mês, que é igual a 30% de comissão sobre o preço de 
cada produto vendido. Cada vendedor, em um determinado mês, vende n produtos, 
onde, para cada produto tem-se o preço unitário e a quantidade vendida. 
O departamento de pessoal deseja obter um relatório com: nome, total de vendas 
(em R$) e salário de cada vendedor. Descreva um algoritmo que gere o relatório 
desejado. Para prosseguir com a entrada de dados o algoritmo deve apresentar a 
seguinte mensagem: “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”. 
O número de produtos (n) de cada vendedor deve ser informado.*/
import java.util.Scanner;
public class Uni5Exe23 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        char dados = 'S';
        String nome = "";
        int produtos, unidades;
        double precoProduto, comissao, comissaoUnidade, salario = 0, totalDeVendas =0;
    
     while (dados == 'S' || dados == 's'){ 
   
   System.out.println("Qual o seu nome?");
   nome = ler.next();
   System.out.println("Quantos produtos você vendeu?");
   produtos = ler.nextInt();

   for (int i=1; i<= produtos; i++){
    System.out.println("Informe o preço do produto " +i);
    precoProduto = ler.nextDouble();
    System.out.println("Quantas unidades do produto " +i+ " você vendeu?");
    unidades = ler.nextInt();

    comissao = (precoProduto * 0.3);
    comissaoUnidade = (comissao * unidades);
    salario += comissaoUnidade;
    //Mostra o valor total dos produtos vendidos
    totalDeVendas += (precoProduto *unidades);

   }
   System.out.println("Nome do funcionario: " +nome);
System.out.println("Total de vendas R$"+ totalDeVendas);
System.out.println("Salário R$" +salario);
System.out.println("deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
dados = ler.next().charAt(0);
     }
}

    }

