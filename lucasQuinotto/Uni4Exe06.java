import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        char sexo;

        System.out.println("Informe seu sexo: M para Masculino, F para Feminino, I para não informado"); 
        sexo = teclado.next().charAt(0);

        if (sexo =='M') {
            System.out.println("Masculino!");}
        else {
           if (sexo =='F') {
               System.out.println("Feminino!");}
        else {
               if (sexo =='I') {
               System.out.println("Sexo não informado");}
        else {
                    System.out.println("Entrada informada incorretamente");}
           }
        }
    }
        
}
