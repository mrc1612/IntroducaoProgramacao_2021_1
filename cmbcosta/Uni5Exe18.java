import java.util.Scanner;

public class Uni5Exe18 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int canal =1;
        int canal4 =0 , canal5 = 0 , canal9 = 0 , canal12 = 0;
        int pessoas = 0;
        int totalPessoas = 0;
        while(canal != 0)
        {
            System.out.println("CANAIS EXISTENTES PARA ESCOLHER: 4, 5, 9, 12 (POR FAVOR INFORME UM DESTES, E 0 CASO QUEIRA TERMINAR O PROGRAMA)");
            System.out.println("Informe o numero canal assistido:");
            canal = scanner.nextInt();
            if(canal == 0)
            {
                break;
            }
            System.out.println("Informe quantas pessoas estao assistindo:");
            pessoas = scanner.nextInt();
            switch(canal)
            {
                case 4:
                    canal4 += pessoas;
                    break;
                case 5:
                    canal5 += pessoas;
                    break;
                case 9:
                    canal9 += pessoas;
                    break;
                case 12:
                    canal12 += pessoas;
                    break;
                default:
                    System.out.println("Insira um dos numeros existentes:");
            }
            totalPessoas += pessoas;
        }
        int perCento4 = (canal4*100) / totalPessoas;
        int perCento5 = (canal5*100) / totalPessoas;
        int perCento9 = (canal9*100) / totalPessoas;
        int perCento12 = (canal12*100) / totalPessoas;
        String s = "O percentual de audiencia do canal";
        System.out.println(s +" 4 eh: " + perCento4 + "%");
        System.out.println(s +" 5 eh: "+ perCento5 + "%");
        System.out.println(s +" 9 eh: " + perCento9 + "%");
        System.out.println(s +" 12 eh: " + perCento12 + "%");

    
        scanner.close();
    }    
}