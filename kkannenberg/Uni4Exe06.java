import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
    
        char genero = sc.next().charAt(0);

        if(genero == 'M' || genero == 'm'){
            System.out.println("Masculino");
        }
        else if(genero == 'F' || genero == 'f'){
            System.out.println("Feminino");
        }
        else{
            System.out.println("Entrada invalida");
        }
        sc.close();

    }
}
