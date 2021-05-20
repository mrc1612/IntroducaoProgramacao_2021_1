import java.util.Scanner;

public class Uni5Exe24 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        System.out.print("Informe o o limite diário (em quilogramas): ");
        double pesoMaximo = tec.nextDouble();

        double pesoAtual = 0;

        char continuar = 0;

        while (pesoAtual < pesoMaximo)
        {
            System.out.print("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?:  ");
            continuar = tec.next().charAt(0);;

            if (continuar == 'n')
                break;
            
            System.out.print("Informe o peso do peixe: ");
            pesoAtual += tec.nextDouble();

            System.out.println("Peso total até o momento: " + pesoAtual + "kg." );
        }

        System.out.println("Peso total: " + pesoAtual + "kg.");

        if (pesoAtual > pesoMaximo)
            System.out.print("O peso maximo foi excedido por: " + (pesoAtual - pesoMaximo) + "kg.");

        tec.close();
    }
}