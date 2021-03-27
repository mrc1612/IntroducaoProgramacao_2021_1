import java.util.Scanner;
public class Uni3Exec14 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double velocidadeMedia, distancia, tempo, qtdCombustivel;

        System.out.println("Informe a distância em km, que você percorreu e o tempo em horas, que levou para percorrê-la");
        distancia = scanner.nextDouble();
        tempo = scanner.nextDouble();

        velocidadeMedia = (distancia / tempo);
        
        qtdCombustivel = (distancia / 12);
        
        System.out.println("A velocidade Média é " + velocidadeMedia + " e gastou " + 
        qtdCombustivel + " litros de combustível.");

        scanner.close();
    }
}