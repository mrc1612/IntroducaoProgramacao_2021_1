import java.util.Scanner;
import java.text.DecimalFormat;


public class Uni4Exe26 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);    
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("T - calcular a área de um triângulo de base b e altura h");
        System.out.println("Q - calcular a área de um quadrado de lado l");
        System.out.println("R - calcular a área de um retângulo de base b e altura h");
        System.out.println("C - calcular a área de um círculo de raio r");

        System.out.println("Gostaria de executar qual opção");
        char opcao = tec.next().charAt(0);

        

        switch (opcao)
        {
            case 'T':
                System.out.println("Informe a base: ");
                double base = tec.nextDouble();
                System.out.println("Informe a altura: ");
                double altura = tec.nextDouble();

                System.out.println("Área: " + (df.format(( base*altura ) /2 )));

                break;
            
            case 'Q':
                System.out.println("Informe a lado: ");
                double lado = tec.nextDouble();
                System.out.println("Área: " + (df.format( lado*2 )));
                break;

            case 'R':
                System.out.println("Informe a base: ");
                double base2 = tec.nextDouble();
                System.out.println("Informe a altura: ");
                double altura2 = tec.nextDouble();

                System.out.println("Área: " + (df.format( base2*altura2 )));
                break;

            case 'C':

                System.out.println("Informe a lado: ");
                double raio = tec.nextDouble();
                System.out.println("Área: " + (df.format( Math.PI * Math.pow(raio,2) )));
                break;

            default:
                System.out.println("Valor inválido");
                break;
        }
        
        tec.close();
    }
}
