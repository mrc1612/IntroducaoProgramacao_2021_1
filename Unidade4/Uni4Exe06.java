import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println(" M - Masculino \n F - Feminino \n I - Nao informado ");
        String letra = teclado.next();

        if (letra == "F"){
            System.out.println("Feminino.");
        } else if (letra == "M"){
            System.out.println("Masculino.");
        } else if (letra == "I"){
            System.out.println("Nao informado.");
        }else{
            System.out.println("Entrada Incorreta.");
        }
    }
}