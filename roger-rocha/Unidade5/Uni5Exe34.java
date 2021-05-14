import java.util.Scanner;

public class Uni5Exe34 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        double precoDia = 0;
        int contasEncerradas = 0;
        do 
        {   
            System.out.println();
            System.out.println("Escolha uma das opcoes abaixo:");
            System.out.println("(1) encerrar a conta de um hóspede");
            System.out.println("(2) verificar número de contas encerradas");
            System.out.println("(3) sair");        
            escolha = sc.nextInt();
            if(escolha == 3)
            {
                break;
            }
            if(escolha == 1)
            {
                System.out.println();
                System.out.println("Insira o nome do hospede:");
                String nomeHospede = sc.next();
                System.out.println("Quantos dias o hospede ficou ?");
                int dias = sc.nextInt();
                contasEncerradas++;
                if(dias < 15)
                {
                    precoDia = 7.50;
                    System.out.println("O hospede: " + nomeHospede + " tera que pagar pela sua estadia: " + (precoDia * dias) + " reais");
                }
                if(dias == 15)
                {
                    precoDia = 6.50;
                    System.out.println("O hospede: " + nomeHospede + " tera que pagar pela sua estadia: " + (precoDia * dias) + " reais");
                }
                if(dias > 15)
                {
                    precoDia = 5.00;
                    System.out.println("O hospede: " + nomeHospede + " tera que pagar pela sua estadia: " + (precoDia * dias) + " reais");
                }
            }
            if(escolha == 2)
            {
                System.out.println("O numero de hospedes que deixaram o hotel eh de: " + contasEncerradas);
            }

            
        } while(escolha != 3);    
   
        
    }    
    
}
