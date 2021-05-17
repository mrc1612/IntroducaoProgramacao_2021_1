import java.util.Scanner;

public class Uni5Exe17 
{
    public static void main(String[] args)  
    {
        Scanner scanner = new Scanner(System.in);
        double altura = 1;
        double media = 0.00;
        int pessoas = 0;
        double maior = 0;
        double menor = 100;
        double totalAltura = 0.00;
        int menorCandidato = 0; 
        int maiorCandidato = 0;
        int candidato = 1;
        while(candidato != 0)
        {  
          System.out.println("Insira o numero do atleta:");
          candidato = scanner.nextInt();  
          if(candidato == 0)
          {
              break;
          }
          System.out.println("Insira a altura do atleta");
          altura = scanner.nextDouble();
          
          totalAltura += altura;
          pessoas++;
          if (altura >= maior) 
          {
            maior = altura;
            maiorCandidato = candidato;
          }
         if (altura <= menor) 
         {
            menor = altura;
            menorCandidato = candidato;
         }
      }
        media = totalAltura / pessoas;     
        System.out.println("A media de altura dos atletas eh de: " + media);
        System.out.println("A altura do atletas mais alto eh de: " + maior + " e seu numero eh: " + maiorCandidato);
        System.out.println("A altura do atletas mais baixo eh de: " + menor + " e seu numero eh: " + menorCandidato);
        scanner.close();

    }    
}