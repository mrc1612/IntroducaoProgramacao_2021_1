import java.util.Scanner;
public class atividade23 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        char dados = 'S';
        String nome = "";
        int produto, unidade;
        double precoProduto, comissao, comissaoUnidade, salario = 0, totalDeVendas =0;
        while (dados == 'S' || dados == 's'){
            System.out.println("Qual o seu nome?");
            nome = teclado.next();
            System.out.println("Quantos produtos você vendeu?");
            produto = teclado.nextInt();
            for (int i=1; i<= produto; i++){
                System.out.println("Informe o preço do produto " +i);
                precoProduto = teclado.nextDouble();
                System.out.println("Quantas unidades do produto " +i+ " você vendeu?");
                unidade = teclado.nextInt();
                comissao = (precoProduto * 0.3);
                comissaoUnidade = (comissao * unidade);
                salario += comissaoUnidade;
                totalDeVendas += (precoProduto *unidade);
            }
        System.out.println("O nome do funcionário é " + nome);
        System.out.println("Total de vendas: R$" + totalDeVendas);
        System.out.println("Salário é de: R$" + salario);
        System.out.println("Você deseja digitar os dados de mais um vendedor? S para sim e N para não: ");
        dados = teclado.next().charAt(0);
     }
}
}