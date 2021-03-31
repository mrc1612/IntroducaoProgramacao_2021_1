import java.util.Scanner;
public class Uni3Ex14 {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double qtd_combustivel, distancia, tempo, velocidade;
        System.out.print("Informe a distância (km) e o tempo (h) do percurso: ");
        distancia = input.nextDouble();
        tempo = input.nextDouble();
        velocidade = (distancia / tempo);
        qtd_combustivel = (distancia / 12);
        System.out.println("A velocidade média é de " + velocidade + " e foram gastos no total " + qtd_combustivel + " litros do combustível.");
    }
}
