import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int num1 = teclado.nextInt();
        
        System.out.println("Digite o numero: ");
        int num2 = teclado.nextInt();

        if (num1 > num2){
            System.out.println("O primeiro numero informado " + num1 + ", é maior que o segundo informado " + num2);
        }else{
            System.out.println("O segundo numero informado " + num2 + ", é maior que o primeiro informado " + num1);
        }
    }
}