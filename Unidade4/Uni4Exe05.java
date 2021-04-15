import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("a cor é azul? ");
        String cor = teclado.next();

        if (cor == "Sim"){
            System.out.println("A cor e azul!");
        }else{
            System.out.println("A cor nao e azul!");
        }
    }
}