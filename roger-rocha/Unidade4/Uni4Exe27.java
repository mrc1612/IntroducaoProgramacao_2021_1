import java.io.IOException;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Uni4Exe27 
{
    public static void main(String[] args) throws IOException
    {
        Scanner s = new Scanner(System.in);
        List l = new LinkedList<>();
        List t = new LinkedList<>();
        System.out.println("Bem-Vindo ao Estacionamento online");
        System.out.println();
        System.out.println("Insira o horario de chegada, nesse formato: 12 50 ... 12h 50min");
        StringTokenizer chegada = new StringTokenizer(s.nextLine(), " ");
        chegada.hasMoreTokens();
        l.add(Integer.parseInt(chegada.nextToken()));  
        l.add(Integer.parseInt(chegada.nextToken()));  
        System.out.println("Insira o horario de saida, nesse formato: 14 30... 14h 30min");
        StringTokenizer saida = new StringTokenizer(s.nextLine(), " "); //pegar a string separar ela pegar esta tranformar em ints colocar esses ints em uma lista
        saida.hasMoreTokens();
        t.add(Integer.parseInt(saida.nextToken()));  
        t.add(Integer.parseInt(saida.nextToken()));  

        int chegadaHora = (int) l.get(0);
        int chegadaMinuto = (int) l.get(1);
        int saidaHora = (int) t.get(0);
        int saidaMinuto = (int) t.get(1);
        
        if(saidaMinuto >= 30)       // esquema de arredondamento de horas
        {
            saidaHora++;
            saidaMinuto = 0;
        }
        else if(saidaMinuto <= 29)
        {
            saidaMinuto = 0;
        }

        
        LocalTime chegadaTime = LocalTime.of(chegadaHora, chegadaMinuto); //Criar a clase chegada para ter em horas as entradas
        LocalTime saidaTime = LocalTime.of(saidaHora, saidaMinuto); // mesma coisa so que com os dados da saida 
        
        System.out.println("diferenca entre as duas eh de " + chegadaTime.until(saidaTime, ChronoUnit.MINUTES)); //pega a diferenca entre a hora de chegada e de saida e printa em mminutos
        int diferenca = (int) chegadaTime.until(saidaTime, ChronoUnit.MINUTES); //armazenando a diferenca de chegada e saida em minutos dentro dessa variavel
        
        if(diferenca <= 60 || diferenca <= 89) // 29min ate 1h29 paga somente por uma hora
        {
            System.out.println("Como voce ficou menos de uma hora e meia, pagara somente por uma hora o preco ficou: R$ 5,00");
        }
        else if(diferenca > 89 && diferenca <= 149) // 1h30 ate 2h29 paga somente por 2hrs
        {
            System.out.println("Como voce ficou mais que 1h30 e menos que 2h30 , pagara por duas horas o preco ficou: R$ 10,00");
        }
        else if(diferenca > 149 && diferenca <= 209) // 2h30 ate 3h29 paga por 3 horas
        {
            System.out.println("Como voce ficou mais que 2h30 e menos que 3h30, pagara por tres horas o preco ficou: R$ 22,50");
        }
        else if(diferenca > 209 && diferenca <= 269) // 3h30 ate 4h29 paga por 4 horas
        {
            System.out.println("Como voce ficou mais que 3h30 e menos que 4h30, pagara por 4 horas o preco ficou: R$ 30,00");
        }
        else if(diferenca > 269 && diferenca < 329) // 4h30 ate 5h29 paga por 5 horas   
        {
            System.out.println("Como voce ficou mais que 4h30 e menos que 5h30, pagara por 5 horas o preco ficou: R$ 50,00");
        }
        else if(chegadaTime.until(saidaTime, ChronoUnit.HOURS) >= 24) // caso houver algum caso maior de 24hrs
        {
            System.out.println("Houve erro nao pode ficar no estacionamento por um periodo maior ou igual a 24hrs");
        }
        else if(diferenca >= 330 && diferenca < 1440) // 5h30 pra frente com a condicao que seja menos que 24hrs
        {
            System.out.println("Voce ficou : " + diferenca +" minutos entao pagara R$: " + (10 *(chegadaTime.until(saidaTime, ChronoUnit.HOURS))));
        }
        
        
        
        /*            TRABALHANDO NA IMPLEMENTACAO DE UM DIA PARA O OUTRO AINDA
        int outrodia;
        if(chegadaHora > saidaHora) // implementar se a hora de chegada for maior que a de saida caso
        {
            outrodia = (int) ((24 - chegadaHora) + saidaHora);
            if(outrodia <= 1 || diferenca <= 2) 
        {
            System.out.println("Como voce ficou menos de uma hora e meia, pagara somente por uma hora o preco ficou: R$ 5,00");
        }
        else if(outrodia > 2 && outrodia < 3) 
        {
            System.out.println("Como voce ficou mais que 1h30 e menos que 2h30 , pagara por duas horas o preco ficou: R$ 10,00");
        }
        else if(outrodia > 3 && outrodia < 4) 
        {
            System.out.println("Como voce ficou mais que 2h30 e menos que 3h30, pagara por tres horas o preco ficou: R$ 22,50");
        }
        else if(outrodia > 4 && outrodia < 5)
        {
            System.out.println("Como voce ficou mais que 3h30 e menos que 4h30, pagara por 4 horas o preco ficou: R$ 30,00");
        }
        else if(outrodia > 5 && outrodia < 24)    
        {
            System.out.println("Como voce ficou: " + outrodia + " horas, pagara R$: " + (10 * outrodia));
        }
        }*/    
        

        
        

       
        
            
        
         
    }
    
   
}
