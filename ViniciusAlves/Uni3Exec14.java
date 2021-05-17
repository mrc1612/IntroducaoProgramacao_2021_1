import java.util.Scanner;
public class Uni3Exec14 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double velocidadeMedia, distancia, tempo, quantidadeDeCombustivel;

        System.out.println("Informe a distância em km, que você percorreu e o tempo em horas, que levou para percorrê-la");
        distancia = teclado.nextDouble();
        tempo = teclado.nextDouble();

        velocidadeMedia = (distancia / tempo);
        
        quantidadeDeCombustivel = (distancia / 12);
        
        System.out.println("A velocidade Média é " + velocidadeMedia + " e gastou " + 
        quantidadeDeCombustivel + " litros de combustível.");

        teclado.close();
    }
}