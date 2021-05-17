import java.util.Scanner;

public class Uni3Exe14 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);    

        double distancia = teclado.nextDouble();
        double tempo = teclado.nextDouble();
        
        double vel_media = distancia/tempo;

        double qtd_combustivel = distancia/12;

        System.out.println("Velocidade média: " + vel_media);
        System.out.println("Quantidade de combustível: " + qtd_combustivel);

        teclado.close();
    }

}
