import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float numero = scanner.nextFloat();

        double resto = numero - Math.floor(numero);

        if(resto != 0f){
            System.out.println("Tem ponto flutuante");
        } else {
            System.out.println("Não tem ponto flutuante");
        }
        

        scanner.close();
    }
}