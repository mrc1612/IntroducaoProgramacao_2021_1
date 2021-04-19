import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Entrada
        System.out.println("Irmão 1, ano: ");
        System.out.println("Irmão 2, ano: ");
        System.out.println("Irmão 3, ano: ");

        int idadeIrmao1 = tec.nextInt();
        int idadeIrmao2 = tec.nextInt();
        int idadeIrmao3 = tec.nextInt();

        //Processo e Saida
        if (idadeIrmao1 == idadeIrmao2 && idadeIrmao1 == idadeIrmao3){
            System.out.println("Trigêmeos");
        }
        else {
            if (idadeIrmao1 == idadeIrmao2 || idadeIrmao1 == idadeIrmao3 || idadeIrmao2 == idadeIrmao3) {
                System.out.println("Gêmeos");
            }
            else {
                System.out.println("Apenas irmãos");
            }
        }

        tec.close();
    }
}
