import java.util.Scanner;

public class Uni5Exe16 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double altura = 1;
        int pessoas = 0;
        double totalAltura = 0;
        double totalAlturaF = 0;
        int mulheres = 0;
        
                while (altura != 0) 
                {
                    System.out.println("Informe a sua altura");
                    altura = sc.nextDouble();
                    if(altura == 0)
                    {
                        break;
                    }
                    System.out.println("Informe seu sexo: M = Masculino, F= feminino:");
                    String sexo = sc.next();
                    if(sexo.equals("F") || sexo.equals("f"))
                    {
                        totalAlturaF += altura;
                        mulheres++;
                        totalAltura += altura;
                        pessoas++;   
                    }
                    if(sexo.equals("M") || sexo.equals("m"))
                    {   
                        totalAltura += altura;
                        pessoas++;
                    }        
                }   
                    double media = totalAltura / pessoas;
                    double mediaMulheres = totalAlturaF / mulheres;  
                    System.out.println("A media de altura da mulheres eh de: " + mediaMulheres);
                    System.out.println("A media de altura do grupo todo eh de: " + media);        
  
    }
}
       

