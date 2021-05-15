import java.util.Scanner;

public class Uni5Exe28 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String opcao = "";
        int banda = 0, banda1 =1, banda2 = 0, banda3 = 0, banda4 = 0, bandaTotal = 0;
        String vencedor = "";
        while (!opcao.equals("n")) 
        {
            System.out.println();
            System.out.println("mais um voto: s (SIM) / n (NÃO)? ");
            opcao = sc.next();
            if(opcao.equals("n"))
            {
                break;
            }
            
                System.out.println("Insira o numero de uma das bandas abaixo:");
                System.out.println();
                System.out.println("1- Nenhum de Nós");
                System.out.println("2- CPM22");
                System.out.println("3- Skank");
                System.out.println("4- Jota Quest");
                banda = sc.nextInt();
                System.out.println();
                if(banda == 1)
                {
                    banda1++;
                }
                if(banda == 2)
                {
                    banda2++;
                }
                if(banda == 3)
                {
                    banda3++;
                }
                if(banda == 4)
                {
                    banda4++;
                }
        }
        if(banda1 > banda2 && banda1 > banda3 && banda1 > banda4)
        {
            vencedor = "Nenhum de Nós";
        }
        if(banda2 > banda1 && banda2 > banda3 && banda2 > banda4)
        {
            vencedor = "CPM22";
        }
        if(banda3 > banda1 && banda3 > banda2 && banda3 > banda4)
        {
            vencedor = "Skank";
        }
        if(banda4 > banda1 && banda4 > banda2 && banda4 > banda3)
        {
            vencedor = "Jota Quest";
        }
        bandaTotal =  banda1 + banda2 + banda3 + banda4;
        double percentual1 = (bandaTotal / banda1);
        double percentual2 = (banda2 / bandaTotal);   
        double percentual3 = (banda3 / bandaTotal);
        double percentual4 = (banda4 / bandaTotal);
            System.out.println("1- Nenhum de Nós: " + banda1 + " votos e o percentual de: " + percentual1 + "%");        
            System.out.println("2- CPM22: " + banda2 + " votos e o percentual de: " + percentual2 + "%");        
            System.out.println("3- Skank: " + banda3 + " votos e o percentual de: " + percentual3 + "%");        
            System.out.println("4- Jota Quest: " + banda4 + " votos e o percentual de: " + percentual4 + "%");        
            System.out.println("");    
            System.out.println("E O GRUPO VENCEDOR FOI: " + vencedor);        
    }    

}