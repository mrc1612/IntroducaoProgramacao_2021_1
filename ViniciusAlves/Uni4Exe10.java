import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int marquinhos;
        int luluzinha;
        int zezinho;

        System.out.println("Informe a idade de Marquinhos");
        marquinhos = teclado.nextInt();

        System.out.println("Informe a idade de zezinho");
        zezinho = teclado.nextInt();

        System.out.println("Informe a idade de luluzinha");
        luluzinha = teclado.nextInt();

        if (marquinhos < zezinho && marquinhos < luluzinha){
            System.out.println("Marquinhos é o menor!");

        } else if (zezinho < marquinhos && zezinho < luluzinha){
            System.out.println("Zezinho é o menor!");

        } else if (luluzinha < marquinhos && luluzinha < zezinho ){
            System.out.println("Luluzinha é a menor!");
        } else {
            System.out.println("Todos possuam a mesma idade!");
        }
    }
}