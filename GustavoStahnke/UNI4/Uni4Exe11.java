import java.util.Scanner;

public class Uni4Exe11 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a data de nascimento do primeiro: ");
        int nascimento_primeiro = input.nextInt();

        System.out.println("Informe a data de nascimento do segundo: ");
        int nascimento_segundo = input.nextInt();

        System.out.println("Informe a data de nascimento do terceiro: ");
        int nascimento_terceiro = input.nextInt();

        if (nascimento_primeiro == nascimento_segundo && nascimento_segundo == nascimento_terceiro) {

            System.out.println("Eles são TRIGÊMEOS!");

        } 
        else {
            if (nascimento_primeiro == nascimento_segundo || nascimento_segundo == nascimento_terceiro
                    || nascimento_terceiro == nascimento_primeiro) {

                System.out.println("Eles são GÊMEOS!");

            } else {

                System.out.println("Eles são APENAS IRMÃOS!");
            }
        }

        input.close();
    }
}
