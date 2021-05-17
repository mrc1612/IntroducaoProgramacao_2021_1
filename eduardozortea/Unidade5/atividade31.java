import java.util.Scanner;
public class atividade31 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int div = 2;
        System.out.println("Informe um número positivo: ");
        int valor = teclado.nextInt();
        while (valor != 1) {
            if ( valor % div == 0){
                System.out.println(div);
                valor = valor/ div;
            } else {
                div ++;
            }
        }
    }
}	