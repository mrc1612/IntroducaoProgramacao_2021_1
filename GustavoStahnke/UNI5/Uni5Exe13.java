import java.util.Scanner;

public class Uni5Exe13 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        double combustivelCompradoParada = 0;
        double combustivelCompradoTotal = 0;
        
        int odometroParada = 0;
        int odometroInicial = 0;
        int kilometragemTotal = 0;

        System.out.print("Informe o valor do odometro na saida: ");
        odometroInicial = input.nextInt();

        kilometragemTotal = odometroInicial;

        System.out.print("Informe a quantidade de paradas: ");
        int quantidadeParadas = input.nextInt();

        for (int i = 0; i < quantidadeParadas; i++)
        {
            System.out.print("[" + (i + 1) + "] Informe o valor do odometro: ");
            odometroParada = input.nextInt();

            System.out.print("[" + (i + 1) + "] Informe o tanto abastecido: ");
            combustivelCompradoParada = input.nextDouble();

            System.out.println("Percorrido por litro: " + ((odometroParada - kilometragemTotal) / combustivelCompradoParada));

            kilometragemTotal += (odometroParada - kilometragemTotal);
            combustivelCompradoTotal += combustivelCompradoParada;
        }
       
        System.out.println("Km/l medio da viagem: " + ((kilometragemTotal - odometroInicial) / combustivelCompradoTotal));

        input.close();
    }
}