import java.util.Scanner;

public class uni4Exe06 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("entre com o caractere");
        char letra = teclado.next().charAt(0);
        
        if (letra == 'm') {
            letra = 'M'; 
            }
            else if (letra == 'f') {
            letra = 'F'; 
            }
            else if (letra == 'i') {
            letra = 'I'; 
        }

        if (letra == 'M') {
            System.out.println("Masculino");
            }
            else if (letra == 'F') {
            System.out.println("Feminino");
            }
            else if (letra == 'I') {
            System.out.println("Não Informado");
            }
            else { 
            System.out.println("Entrada incorreta");
        }
        teclado.close();
    }
}