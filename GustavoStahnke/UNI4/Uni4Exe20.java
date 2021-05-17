import java.util.Scanner;
import java.text.DecimalFormat;


public class Uni4Exe20 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe a nota 1: ");
        double n1 = input.nextDouble();
        System.out.println("Informe a nota 2: ");
        double n2 = input.nextDouble();
        System.out.println("Informe a nota 3: ");
        double n3 = input.nextDouble();
        System.out.println("Informe a media dos exercícios: ");
        double mExe = input.nextDouble();

        double media = (n1 + (n2 * 2) + (n3 * 3) + mExe)/7;

        DecimalFormat df = new DecimalFormat("0.00");

        if(media >= 9){
            System.out.println("Média: " + df.format(media) + " A " + " Aprovado");
        }
        else{
            if(media >= 7.5){
                System.out.println("Média: " + df.format(media) + " B " + " Aprovado");
            }
            else{
                if(media >= 6){
                    System.out.println("Média: " + df.format(media) + " C " + " Aprovado");
                }
                else{
                    if(media >= 4){
                        System.out.println("Média: " + df.format(media) + " D " + " Reprovado");
                    }
                    else{
                        System.out.println("Média: " + df.format(media) + " E " + " Reprovado");
                    }
                }
            }
        }

        input.close();
    }

}