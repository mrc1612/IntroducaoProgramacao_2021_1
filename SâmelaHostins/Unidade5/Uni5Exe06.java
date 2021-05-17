
//Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.
import java.util.Scanner;
public class Uni5Exe06 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
    float media;
    float altura = 0;
     System.out.println("Entre com a altura de 20 pessoas: ");
      for(int i=1; i <= 20; i++){
          altura += ler.nextFloat();
      }
      media = altura / 20;
      System.out.println("A media das alturas e de: " + media);
    }
}
