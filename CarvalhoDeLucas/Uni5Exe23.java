import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String continuar = "";

        int quantidade = 0;
        int cont = 0;
        int totalVendas = 0;

        double salario = 0;

        String continuarProduto = "";

        while (!continuar.toUpperCase().equals("NAO")) {

            System.out.print("Informe o nome do vendedor: ");
            String nome = teclado.next();

            while (!continuarProduto.toUpperCase().equals("NAO")) {

                System.out.print("Preço do produto: R$");
                double preco = teclado.nextDouble();
    
                System.out.print("Quantidade vendida: ");
                quantidade += teclado.nextInt();

                salario += (preco * quantidade) * 0.3;

                System.out.print("Digitar mais um produto? ");
                continuarProduto = teclado.next();

                cont++;
                totalVendas += quantidade;

            }

            System.out.println("Nome vendedor: " + nome);
            System.out.println("Salário: R$" + salario);
            System.out.println("Vendeu " + totalVendas + " unidades");
            System.out.println("De " + cont + " produtos");

            System.out.print("Deseja digitar os dados de mais um vendedor");
            continuar = teclado.next();

        }

        teclado.close();

    }
}
