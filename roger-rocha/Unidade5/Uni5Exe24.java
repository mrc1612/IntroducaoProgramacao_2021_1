import java.util.Scanner;

public class Uni5Exe24 
{
    
    //Os regulamentos de uma competição de pesca impõem um limite no peso total de pesca de um dia.
    // Descreva um algoritmo que leia o limite diário (em quilogramas) e então leia o peso (em gramas) de cada peixe e escreva o peso total da pesca obtido até aquele ponto.
    // Quando o limite diário for excedido escreva uma mensagem e encerre a execução do algoritmo.
    // Para prosseguir com a entrada de dados de pesos de cada peixe o algoritmo deve apresentar a seguinte mensagem:
    // “deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?”.    
   
   public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        double pesoLimite = 30;
        String s = "";
        double pesoPeixao = 0;
        double pesoTotal = 0;
        while(!s.equals("n"))
        {
            System.out.println("deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
            s = sc.next();
            if(s.equals("n"))
            {
                break;
            }
            System.out.println("Quanto que esta o peso desse peixao em gramas ?");
            pesoPeixao = sc.nextDouble();
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
