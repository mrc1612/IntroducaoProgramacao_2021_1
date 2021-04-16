import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner(System.in);
       int ano1, ano2, ano3;

        System.out.println("Informe o ano de nascimento do primeiro menino");
        ano1 = teclado.nextInt();

        System.out.println("Informe o ano de nascimento do segundo menino");
        ano2 = teclado.nextInt();

        System.out.println("Informe o ano de nascimento do terceiro menino");
        ano3 = teclado.nextInt();

        if (ano1 == ano2 && ano1 == ano3 ){
            System.out.println("Os tres meninos são trigemeos");
        } else if (ano1 == ano2 && ano1 != ano3){
                System.out.println("O primeiro e o segundo meninos são gemeos");
        } else if (ano1 == ano3 && ano1 != ano2){
                System.out.println("O primeiro e o terceiro meninos são gemeos");
        } else if (ano2 == ano3 && ano2 != ano1){
                System.out.println("O segundo e o terceiro meninos são gemeos");   
        } else {
            System.out.println("Os meninos são apenas irmãos");
        }
    }
}