import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int nenhumDeNos = 0;
        int CPM22 = 0;
        int Skank = 0;
        int jotaQuest = 0;

        int totalVotos = 0;

        double porcentagemNenhumDeNos = 0;
        double porcentagemCPM22 = 0;
        double porcentagemSkank = 0;
        double porcentagemJotaQuest = 0;

        String vencedor = "";
        int maiorVoto = 0;

        while (true) {

            System.out.println("-- SEU VOTO --");
            System.out.println("1 - Nenhum de Nós");
            System.out.println("2 - CPM22");
            System.out.println("3 - Skank");
            System.out.println("4 - Jota Quest");
            int voto = teclado.nextInt();

            switch (voto) {
                case 1:
                    nenhumDeNos++;
                    break;
                case 2:
                    CPM22++;
                    break;
                case 3:
                    Skank++;
                    break;
                case 4:
                    jotaQuest++;
                    break;
            }

            totalVotos++;

            System.out.print("Mais um voto: s (SIM) / n (NÃO)? ");
            String continuar = teclado.next();

            if (continuar.toLowerCase().equals("n")) {
                break;
            }

        }

        porcentagemNenhumDeNos = (nenhumDeNos / totalVotos) * 100;
        porcentagemCPM22 = (CPM22 / totalVotos) * 100;
        porcentagemSkank = (Skank / totalVotos) * 100;
        porcentagemJotaQuest = (jotaQuest / totalVotos) * 100;
        
        if (nenhumDeNos > maiorVoto) {
            maiorVoto = nenhumDeNos;
            vencedor = "Nenhum de Nós";
        }

        if (CPM22 > maiorVoto) {
            maiorVoto = CPM22;
            vencedor = "CPM22";
        }

        if (Skank > maiorVoto) {
            maiorVoto = Skank;
            vencedor = "Skank";
        }

        if (jotaQuest > maiorVoto) {
            maiorVoto = jotaQuest;
            vencedor = "Jota Quest";
        }

        System.out.println("Total de votos em Nenhum de Nós: " + nenhumDeNos);
        System.out.println("Porcentagem: " + porcentagemNenhumDeNos + "%");

        System.out.println("Total de votos em CPM22: " + CPM22);
        System.out.println("Porcentagem: " + porcentagemCPM22 + "%");

        System.out.println("Total de votos em Skank: " + Skank);
        System.out.println("Porcentagem: " + porcentagemSkank + "%");

        System.out.println("Total de votos em Jota Quest: " + jotaQuest);
        System.out.println("Porcentagem: " + porcentagemJotaQuest + "%");

        System.out.println("Vencedor " + vencedor);

        teclado.close();

    }
}
