import java.util.Scanner;

public class Uni5Exe26 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        int trechosAcima = 0;
        int totalTrechos = 0;
        int trechosAcimaDe150Bons = 0;
        
        System.out.print("Informe o valor que Astolfo se nega a pagar: ");
        double nega = tec.nextDouble();

        double custoPedagio = 0;
        double distancia = 0;

        System.out.print("Informe o custo do pedagio: ");
        custoPedagio = tec.nextDouble();

        while (custoPedagio >= 0)
        {
            System.out.print("Informe a distancia do trecho: ");
            distancia = tec.nextDouble();

            totalTrechos++;

            if (custoPedagio >= nega)
                trechosAcima++;
            else if (distancia > 150)
                trechosAcimaDe150Bons++;

            System.out.print("Informe o custo do pedagio: ");
            custoPedagio = tec.nextDouble();
        }

        System.out.println(trechosAcima + "(trechos com valor acima do qual ele nega-se a pagar)");
        System.out.println(totalTrechos + "(quantidade de trechos informados)");
        System.out.println(trechosAcimaDe150Bons + "(trechos acima de 150km com valor aceito por ele)");

        tec.close();
    }
}