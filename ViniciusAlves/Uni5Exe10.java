import java.util.Scanner;

public class Uni5Exe10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    for(int i = 1000; i < 10000; i++){
      String parte1 = Integer.toString(i).substring(0,2);
      String parte2 = Integer.toString(i).substring(2,4);

      int numero1 =  Integer.parseInt(parte1);
      int numero2 =  Integer.parseInt(parte2);


        int calculo = numero1 + numero2;
        int calculo1 = calculo * calculo;

        
        if(i == calculo1){
          System.out.println(calculo1);
        }
    }
  }
}