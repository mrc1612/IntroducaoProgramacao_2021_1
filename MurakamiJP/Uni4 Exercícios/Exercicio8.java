import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner (System.in);

        String letra_inf;

        System.out.print("Informe uma letra: ");
        letra_inf = teclado.nextLine();

        if (letra_inf.equals("a") || letra_inf.equals("e") || letra_inf.equals("i") ||
            letra_inf.equals("o") || letra_inf.equals("u")) {

                System.out.print(letra_inf + " é uma VOGAL");
        }
        else {
                System.out.print(letra_inf + " não é uma VOGAL");
        }
        
        teclado.close();
    }
    
}
