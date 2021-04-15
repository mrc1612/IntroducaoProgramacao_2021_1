import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o ano de nascimento do primeiro irmão: ");
        int primeiro = teclado.nextInt();

        System.out.print("Informe o ano de nascimento do segundo irmão: ");
        int segundo = teclado.nextInt();

        System.out.print("Informe o ano de nascimento do terceiro irmão: ");
        int terceiro = teclado.nextInt();

        if (primeiro == segundo && segundo == terceiro) {
            System.out.println("São trigêmeos");
        } else if (primeiro != segundo && segundo != terceiro && terceiro != primeiro) {
            System.out.println("São apenas irmãos");
        } else {
            System.out.println("São gêmeos");
        }

        teclado.close();

    }
}
