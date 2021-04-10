import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int curso;
        System.out.println("Sabendo que 1 = Ciência da Computação, 2 = Licenciatura da Computação e 3 = Sistemas de informação");
System.out.println("Digite o número do curso que você está cursando para saber seu título");
      curso = ler.nextInt();
switch (curso)
{
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
    System.out.println("Nenhuma opção foi selecionada");  
}
    }
}
