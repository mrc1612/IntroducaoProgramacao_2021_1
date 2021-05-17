import java.util.*;

public class Ex14 {
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);

        double quantidadeCombustivel;
        double distancia;
        double tempo;
        double velocidade;

        System.out.print("Informe a distancia e o tempo do percurso: ");

        distancia = teclado.nextDouble();
        tempo = teclado.nextDouble();

        velocidade = distancia / tempo;
        quantidadeCombustivel = distancia / 12;

        System.out.println("Velocidade média: " + velocidade);
        System.out.println("Total de litros do combustibel: " + quantidadeCombustivel);
    }
}