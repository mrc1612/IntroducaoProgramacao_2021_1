import java.util.Scanner;

public class Uni5Exe24 
{  
   public static void main(String[] args) 
   {
        Scanner scanner = new Scanner(System.in);
        double pesoLimite = 30;
        String s = "";
        double pesoPeixao = 0;
        double pesoTotal = 0;
        while(!s.equals("n"))
        {
            System.out.println("deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
            s = scanner.next();
            if(s.equals("n"))
            {
                break;
            }
            System.out.println("Quanto que esta o peso desse peixao em gramas ?");
            pesoPeixao = scanner.nextDouble();
            pesoTotal += pesoPeixao;
            if(pesoTotal <= (pesoLimite * 1000))
            {
                System.out.println("Tudo certo Campeao!, nao excedeu o limite diario");
            }
            if(pesoTotal > (pesoLimite * 1000))
            {
                System.out.println("Opa mas tu pescou demais agora campeao, tu excedeu o limite diario");
            }
        }
        

    
   } 
}