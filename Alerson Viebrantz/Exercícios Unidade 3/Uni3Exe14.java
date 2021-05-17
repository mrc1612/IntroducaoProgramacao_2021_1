import java.util.Scanner;

public class Uni3Exe14 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);    

        double distancia = tec.nextDouble();
        double tempo = tec.nextDouble();
        
        double vel_media = distancia/tempo;

        double qtd_combustivel = distancia/12;

        System.out.println("A Velocidade média: " + vel_media);
        System.out.println("A Quantidade de combustível: " + qtd_combustivel);

        tec.close();
    }

}