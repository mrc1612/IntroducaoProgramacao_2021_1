import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) throws Exception {
        
        double numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número");
        numero = sc.nextDouble();

        double resto = numero - Math.floor(numero);

        if (resto != 0f){
            System.out.println("Número tem parte decimal");
        }else{
            System.out.println("Número não tem parte decimal");
        }
        sc.close();
    }
}
