import java.util.Scanner;

public class Uni4Exe08 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe uma vogal: ");
        char valor = input.next().charAt(0);
        valor = Character.toUpperCase(valor);
        
        if (valor == 'A' || valor == 'E' || valor == 'I' || valor == 'O'|| valor == 'U'  ){

            System.out.println("É vogal");
        }
        else{
            System.out.println("Não é vogal");
        }
        
        
        
        input.close();
    }

}