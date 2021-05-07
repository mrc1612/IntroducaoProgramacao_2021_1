
/*Um motorista acaba de voltar de um feriado prolongado. Antes de sair de viagem 
e imediatamente após retornar, o motorista encheu o tanque do veículo e registrou 
as medidas do odômetro. Em cada parada feita durante a viagem, foi registrado o 
valor do odômetro e a quantidade de combustível comprado para reabastecer o veículo 
(suponha que o tanque foi enchido a cada parada). Descreva um algoritmo que leia o 
número total de reabastecimentos feitos e os dados registradosrelativos à compra de
 combustível. Calcule e escreva:
   - a quilometragem obtida por litro de combustível em cada parada;
   - a quilometragem média obtida por litro de combustível em toda a viagem.
*/
import java.util.Scanner;
public class Uni5Exe13 {
    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in);

        System.out.println("Qual é o valor do ôdometro inicial?");
        int odometroInicial = ler.nextInt();
        System.out.println("Quantas vezes o motorista parou para abastecer?");
        int qtsDeParada = ler.nextInt();

        int combustivel =0;
        int combustivelTotal = 0;

        //Pedirá a quilometragem e os litros abastecidos para cada parada.
        for (int i=1; i<=qtsDeParada; i++){
          System.out.println("Valor do odometro na parada " + i);
          int valorDoOdometro = ler.nextInt();
          System.out.println("Quantidade de combustível colocada na parada " +i);
          combustivel = ler.nextInt();

        /*Fará com que cada vez que eu digite o valor de um combustível ele some ao novo valor.
        Ex: parada 1 = 10L, parada 2 = 20L -> Combustivel total = 30L */
        combustivelTotal += combustivel;

    // quilometragem obtida por litro de combustível em cada parada;
    int quilometragemPorLitro = (valorDoOdometro/ combustivel);
    System.out.println("Quilometragem obtida por litro de combustível nesta parada: "+quilometragemPorLitro );
    System.out.println("\n");     }


    //quilometragem média obtida por litro de combustível em toda a viagem.
    System.out.println("Qual é o valor do ôdometro final?");
    int odometroFinal = ler.nextInt();
    int KmTotalAndado = (odometroFinal - odometroInicial);
    int quilometragemMedia = ( KmTotalAndado/ combustivelTotal);
    System.out.println ("A quilometragem média obtida por litro de combustível em toda a viagem foi: "+quilometragemMedia);

    }
}
