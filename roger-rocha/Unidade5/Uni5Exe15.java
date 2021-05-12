import java.util.Scanner;

public class Uni5Exe15 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        double n1, n2;
        double media = 0.00;

           while(!nome.equals("fim"))
           {
                if (nome != "fim")
                {
                    System.out.println("Digite o nome do aluno:");
                    nome = sc.next();
                    if(nome.equals("fim"))
                    {
                        break;
                    }
                    System.out.println("Digite a nota da prova 1:");
                    n1 = sc.nextInt();
                    System.out.println("Digite a nota da prova 2:");
                    n2 = sc.nextInt();

                    media = (n1 + n2) / 2;
                }
                System.out.println("A media do " +nome + " eh de: " + media);   
           }   
        
    }    
}
