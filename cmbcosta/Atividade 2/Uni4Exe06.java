import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o sexo ?");
        
        char resposta = scanner.next().toUpperCase().charAt(0);

        if(resposta == 'M'){

            System.out.println("Masculino");

        }else if(resposta == 'F'){

            System.out.println("Feminino");

        }else if(resposta == 'I'){

            System.out.println("Não Informado");

        }else{
            
            System.out.println("Entrada Incorreta");
        }
        


        scanner.close();
    }
}