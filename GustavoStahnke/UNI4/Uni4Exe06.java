import java.util.Scanner;

public class Uni4Exe06 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe M, F ou I: ");
        char valor = input.next().charAt(0);
        valor = Character.toUpperCase(valor);
        
        if (valor == 'M'){

            System.out.println("Masculino");
        }
        else{
            if (valor == 'F'){

                System.out.println("Feminino");
            }
            else{
                if (valor == 'I'){

                    System.out.println("Não Informado");
        
                }
                else{
                    System.out.println("“Entrada Incorreta”");
                    
                }
            }
        }
        
        
        
        input.close();
    }

}