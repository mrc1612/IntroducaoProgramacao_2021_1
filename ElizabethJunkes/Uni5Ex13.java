import java.util.Scanner;
public class Uni5Ex13 {
    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in);
        System.out.print("Qual é o valor inicial do ôdometro? ");
        int odometroInicial = ler.nextInt();
        System.out.print("Quantas vezes o motorista parou para fazer o abastecimento? ");
        int qtsDeParada = ler.nextInt();
        int combustivel = 0;
        int combustivelTotal = 0;
        for (int i=1; i<=qtsDeParada; i++){
          System.out.print("Valor do odômetro na parada " + i);
          int valorDoOdometro = ler.nextInt();
          System.out.print("Quantidade de combustível colocada na parada " + i + " ");
          combustivel = ler.nextInt();
        combustivelTotal += combustivel;
        int quilometragemPorLitro = (valorDoOdometro/ combustivel);
        System.out.print("Quilometragem obtida por litro de combustível nessa parada: "+quilometragemPorLitro );  
        }
        System.out.print("Qual é o valor do ôdometro final? ");
        int odometroFinal = ler.nextInt();
        int KmTotalAndado = (odometroFinal - odometroInicial);
        int quilometragemMedia = ( KmTotalAndado/ combustivelTotal);
        System.out.println("A quilometragem média obtida por litro de combustível em toda a viagem foi: "+quilometragemMedia);
    }
}