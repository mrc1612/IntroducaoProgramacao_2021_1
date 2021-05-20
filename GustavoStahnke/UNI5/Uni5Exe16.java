import java.util.Scanner;

public class Uni5Exe16 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);        

        /*
        Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do
        sexo (sexo = 'M' ou sexo = 'm' para masculino e sexo = 'F' e sexo = 'f' para feminino) de 
        cada pessoa informe a média da altura das mulheres e a média de altura do grupo. A leitura deve ser finalizada ao digitar 0 para a altura.
        */

        double  altura = 0;
        char sexo = 0;

        double totalAlturaMulheres = 0;
        int totalMulheres = 0;

        double totalAlturaHomens = 0;
        int totalHomens = 0;

        System.out.print("Informe a altura: ");
        altura = input.nextDouble();

        while (altura > 0)
        {
            System.out.print("Informe o sexo: ");
            sexo = input.next().charAt(0);

            if (sexo == 'M' || sexo == 'm')
            {
                totalAlturaHomens += altura;
                totalHomens++;
            }
            else
            {
                totalAlturaMulheres += altura;
                totalMulheres++;
            }
            
            System.out.print("Informe a altura: ");
            altura = input.nextDouble();
        }
        
        if (totalHomens > 0)
            System.out.println("Media da altura do homens: " + (totalAlturaHomens / totalHomens));

        if (totalMulheres > 0)
            System.out.println("Media da altura das mulheres: " + (totalAlturaMulheres / totalMulheres));

        input.close();
    }
}