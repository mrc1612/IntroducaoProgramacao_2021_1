import java.util.Scanner;

public class Uni5Exe33 
{
    public static void main(String[] args) 
    {   
        int opcaoUsuario = 0;
        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, votoTotal=0; 
        double votoNulo = 0, votoBranco = 0; 
        double percentual = 0;
        
        Scanner sc = new Scanner(System.in);
        do {
            //escolha das opcoes
            System.out.println("");
            System.out.println("Escolha uma das opcoes abaixo para votar:");
            System.out.println("");
            System.out.println("(1) para o candidato 1");
            System.out.println("(2) para o candidato 2");
            System.out.println("(3) para o candidato 3");
            System.out.println("(4) para o candidato 4");
            System.out.println("(5) para votar em nulo");
            System.out.println("(6) para votar em branco");
            System.out.println("(0) para terminar o programa");
            opcaoUsuario = sc.nextInt();
            System.out.println("");

            if(opcaoUsuario == 0)
            {
                break;
            }
            switch (opcaoUsuario) {
                case 1:
                    candidato1++;
                    votoTotal++;
                    break;
                case 2:
                    candidato2++;
                    votoTotal++;
                    break;
                case 3:
                    candidato3++;
                    votoTotal++;
                    break;
                case 4:
                    candidato4++;
                    votoTotal++;
                    break;
                case 5:
                    votoNulo++;
                    votoTotal++;
                    break;
                case 6:
                    votoBranco++;
                    votoTotal++;
                    break;
                default:
                    System.out.println("Numero inserido nao existente, por favor insira um dos numeros na lista");
            }
        } while (opcaoUsuario != 0);
                percentual = ((votoBranco + votoNulo) / votoTotal) * 100;
                System.out.println("CANDIDATO 1: " + candidato1 + " VOTOS");
                System.out.println("CANDIDATO 2: " + candidato2 + " VOTOS");
                System.out.println("CANDIDATO 3: " + candidato3 + " VOTOS");
                System.out.println("CANDIDATO 4: " + candidato4 + " VOTOS");
                System.out.println("TOTAL NULO: " + votoNulo + " VOTOS");
                System.out.println("TOTAL BRANCO: " + votoBranco + " VOTOS");
                System.out.println("PERCENTUAl DE VOTOS BRANCOS E NULOS SOBRE O TOTAL DE VOTOS: " + percentual + "%");
    }    
}
 