import java.util.Scanner;
public class Uni5Ex20 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float massa; 
        int tempo = 1, tempoFinal;
        System.out.println("Informe a massa em kg do material radioativo:");
        massa = ler.nextInt();
        float massa1 = (massa*1000);
        float massa2 = massa1;
        while(massa2 >= 0.5){
            massa2 = massa2 / 2;
            tempo++;
            if (massa2<=0.5){
                float massaFinal = massa2;
                System.out.println("A massa final é de: " + massaFinal);
            }
        }
        tempoFinal = tempo *50;
        System.out.println("Será necessário: " + tempoFinal + " segundos para que essa massa se torne menor que 0,5 gramas.");
}}
