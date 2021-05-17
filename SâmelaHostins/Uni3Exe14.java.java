import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double velocidadeMedia, distancia, tempo, quantidadeDeCombustivel;
        System.out.println("Informe a distância em km, que você percorreu e o tempo em horas, que levou para percorrê-la");
        distancia = ler.nextDouble();
        tempo = ler.nextDouble();
        velocidadeMedia = (distancia / tempo);
        quantidadeDeCombustivel = (distancia / 12);
        System.out.println("A velocidade Média é " + velocidadeMedia + " e gastou " + 
        quantidadeDeCombustivel + " litros de combustível.");


    }
}
