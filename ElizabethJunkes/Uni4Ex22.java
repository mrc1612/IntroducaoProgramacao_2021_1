import java.util.Scanner;
public class Uni4Ex22 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int curso;
        System.out.println("[1] = Ciência da Computação");
        System.out.println("[2] = Licenciatura da Computação");
        System.out.println("[3] = Sistemas de Informação");
        System.out.print("Digite o número do seu curso para saber o seu título: ");
        curso = teclado.nextInt();
        switch (curso) {
            case 1:
                System.out.println("Bacharel em ciência da computação.");
                    break;
            case 2:
                    System.out.println("Licenciado em computação.");
                    break;
            case 3:
            System.out.println("Bacharel em sistemas de informação");
                    break;
            default:
            System.out.println("Nenhuma opção válida foi selecionada.");  
        }
            }
        }