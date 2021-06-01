import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes.
 Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino), uma nota para o cinema (zero até dez, valor inteiro) e a idade.

Baseado nisto faça um programa que informe:

qual a nota média recebida pelo cinema;
qual a nota média atribuída pelos homens;
qual a nota atribuída pela mulher mais jovem;
quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.
Utilize os conceitos aprendidos sobre vetores (ou mesmo o uso de matriz) e métodos para a resolução deste exercício.*/
public class Uni6Exe09 
{
    public static void main(String[] args) 
    {
        new Uni6Exe09();
    }
    public Uni6Exe09()
    {
        int mulheres50, geral, notaNovinha;
        ArrayList<Double> men = new ArrayList<>();
        ArrayList<Double> mediaGeral = new ArrayList<>();
        ArrayList<Double> notaWoman = new ArrayList<>();
        ArrayList<Double> idadeWoman = new ArrayList<>();
        ArrayList<Double> notaOldWoman = new ArrayList<>();
        lerTudo(men, mediaGeral, idadeWoman, notaWoman, notaOldWoman);
        escreverTudo(mediaGeral, men, idadeWoman, notaWoman, notaOldWoman);
    }
    public void lerTudo(ArrayList men, ArrayList mediaGeral, ArrayList idadeWoman, ArrayList notaWoman, ArrayList notaOldWoman)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<30; i++)
        {
            System.out.println("Coloque M ou F para o sexo");
            String sexo = sc.next();
            if(sexo.equals("M") || sexo.equals("m"))
            {
                System.out.println("Coloque a sua nota:");
                double notaMen = sc.nextDouble();
                men.add(notaMen);
                mediaGeral.add(notaMen);
            }
            else
            {
                System.out.println("Coloque a sua idade:");
                int idade = sc.nextInt();
                if(idade>50)
                {
                    System.out.println("Coloque a sua nota:");
                    notaOldWoman.add(sc.nextDouble());                    
                }
                else
                {
                    idadeWoman.add(idade);                 
                    System.out.println("Coloque a sua nota:");
                    double notaWomen = sc.nextDouble();
                    notaWoman.add(notaWomen);
                    mediaGeral.add(notaWomen);
                }
                    
            }
        }
    }
    public void escreverTudo(ArrayList mediaGeral, ArrayList men, ArrayList idadeWoman, ArrayList notaWoman, ArrayList notaOldWoman)
    {
        double soma= 0;
        for(int i = 0; i < mediaGeral.size(); i++)
        {
            soma +=(double) mediaGeral.get(i);
        }
        double media = (double) soma / mediaGeral.size();
        System.out.println("A media geral eh de: " + media);
        
        double somaMen =0;
        for(int x = 0; x < men.size(); x++)
        {
            somaMen +=(double) mediaGeral.get(x);
        }
        double mediaHomem = (double) somaMen / men.size();
        System.out.println("A media geral dos homens eh: " + mediaHomem);

        int minIdadeIndex = idadeWoman.indexOf(Collections.min(idadeWoman)); //problema com essa porra
        Object notaJovem = notaWoman.get(minIdadeIndex);
        System.out.println("A nota atribuida pela mulher mais jovem foi de :" + notaJovem);


        double oldLady= 0;
        for(int j = 0; j < notaOldWoman.size(); j++)
        {
            int indexOldLady = (int) notaOldWoman.get(j); //problema com essa daqui tambem
            if(indexOldLady > media)
            {
                oldLady++;
            }
        }
        System.out.println("A quantidade de mulheres com idade acima de 50 que avaliaram uma nota acima da media geral eh de: " + oldLady);


        
        
    }
}
