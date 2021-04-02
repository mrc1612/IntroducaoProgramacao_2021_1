import java.util.Scanner;

public class Uni3Exe14 {
    /*Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana, calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro. */

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double dist, temp, vel, comb;
        System.out.println("Digite a distância percorrida: ");
        dist = teclado.nextDouble();
        System.out.println("Digite o tempo gasto (em horas): ");
        temp = teclado.nextDouble();

        vel = (dist / temp);

        comb = (dist * 12);

        System.out.println("A distância percorrida foi de: " + dist + "km");
        System.out.println("O tempo gasto foi de: " + temp + " horas");
        System.out.println("A velocidade média foi de: " + vel + " km/hora");
        System.out.println("A quantidade gasta de combustível foi de: " + comb + " litro(s)");

        teclado.close();
    }
    
}
