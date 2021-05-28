import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Uni6Exe05 
{
    public static void main(String[] args) 
    {
        new Uni6Exe05();
    }
    public Uni6Exe05()
    {
        int[] guria = new int[5];
        int[] guri = new int[5];

        lerRespostas(guria, guri);
        int indice = medirAfinidade(guria, guri);
        escreverAfinidade(indice);

    }
    
    public void lerRespostas(int[] guria, int[] guri)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("RESPONDA AS PERGUNTAS A SEGUIR");
        System.out.println("VOCE PODE RESPONDER COM 3 OPCOES: (1)-SIM  (2)-NAO  (3)-INDIFERENTE");
        System.out.println();
        System.out.println("Questao (0)- Gosta de musica sertaneja ?");
        System.out.println("Questao (1)- Gosta de futebol ?");
        System.out.println("Questao (2)- Gosta de seriados ?");
        System.out.println("Questao (3)- Gosta de redes socias ?");
        System.out.println("Questao (4)- Gosta da Oktober ?");

        for(int i=0; i< 5; i++)
        {
            System.out.println("Digite 1, 2 ou 3 para a resposta da questao "+ i + " da GURIA:");
            guria[i] = sc.nextInt(); 
            System.out.println("Digite 1, 2 ou 3 para a resposta da questao "+ i + " do GURI:");
            guri[i] = sc.nextInt();
        }
    } 
    public int medirAfinidade(int[] guria, int[] guri)
    { int indice = 0;
        for(int j=0; j<5; j++)
        {
            if(guria[j] == guri[j])
                indice += 3;
            else if(guria[j] == 3 && guri[j] == 1 || guri[j] == 3 && guria[j] == 1 || guria[j] == 2 && guri[j] == 3 || guri[j] == 2 && guria[j] == 3)
                indice++;
            else
                indice -= 2;
            
        }
        return indice;

    }
    public void escreverAfinidade(int indice)
    {
        if(indice == 15)
            System.out.println("CASEM!");
        else if(indice < 15 || indice >= 10)
           System.out.println("Voces tem muito em comum"); 
        else if(indice >= 5 || indice <= 9)
            System.out.println("talvez nao de certo");
        else if(indice <= 4 || indice >= 0)
            System.out.println("vale um encontro");
        else if(indice <= -1 || indice >= -9)
            System.out.println("melhor nao perder muito tempo");
        else          
            System.out.println("voces se odeiam");
    }
}
