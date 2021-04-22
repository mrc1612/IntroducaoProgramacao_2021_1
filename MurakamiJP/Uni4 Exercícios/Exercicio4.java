import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        
      Scanner teclado = new Scanner(System.in);

        float valor = teclado.nextFloat();

        if(valor != (int)valor){
            System.out.println("Existe parte decimal no valor indicado");
        }
        
      System.out.println(valor);
        teclado.close();
    }
}
