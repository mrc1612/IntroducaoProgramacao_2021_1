import java.util.Scanner;


public class Uni5Exe14 
{
 public static void main(String[] args) 
 {
    Scanner scanner = new Scanner(System.in);
    Double compra, venda;
    String nome;
    Double compraTotal = 0.00;
    Double vendaTotal = 0.00;
    Double lucroTotal = 0.00;
    Double lucro;
    int lucro10 = 0;
    int lucro10e20 = 0;
    int lucro20 = 0;  

    for(int i=0; i < 20; i++)
    {
        System.out.println("Insira o nome do produto: ");
        nome = scanner.next();
        System.out.println("Insira o preco de custo do produto:");
        compra = scanner.nextDouble();
        System.out.println("Insira o preco de venda do produto:");
        venda = scanner.nextDouble();
        lucro = (venda - compra) / compra * 100;
        compraTotal += compra;
        vendaTotal += venda;
        lucroTotal += lucro;
        if(lucro < 10)
        {
            lucro10++;
        }
        else if(lucro > 10 && lucro < 20)
        {
            lucro10e20++;
        }
        else
        {
            lucro20++;
        }
    }

    System.out.println("A quantidade de mercadorias que tem lucro < 10% : " + lucro10);
    System.out.println("A quantidade de mercadorias que tem lucro > 10% e lucro < 20% : " + lucro10e20);
    System.out.println("A quantidade de mercadorias que tem lucro > 20% : " + lucro20);
    System.out.println();
    System.out.println("O total de compra foi de: " + compraTotal);
    System.out.println("O total de venda foi de: " + vendaTotal);
    System.out.println("O total de lucro foi de: " + lucroTotal);
    



    
       
 }
   

}