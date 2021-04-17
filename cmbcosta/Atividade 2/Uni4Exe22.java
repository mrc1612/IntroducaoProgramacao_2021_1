import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.println("Dígite 1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação ?");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1: 
                System.out.println("Bacharel em Ciência da Computação");
                break;
                case 2: 
                System.out.println("Licenciado em Computação");
                break;
                case 3: 
                System.out.println("Bacharel em Sistemas de Informação");
                break;
        
            default:
                break;
        }


        




        scanner.close();
    }
}