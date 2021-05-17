import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Entrada
        System.out.println("Informe o primeiro número: ");
        System.out.println("Informe o segundo número: ");
        int numero1 = tec.nextInt();
        int numero2 = tec.nextInt();

        //Processo
        if (numero1 % numero2 == 0) {
            System.out.println("Os números informados são multiplos");
        }
        else {
            System.out.println("Os números não são multiplos");
        }
    }
}
