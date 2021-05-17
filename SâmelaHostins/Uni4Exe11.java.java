import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in);
       int ano1, ano2, ano3;
        System.out.println("Informe o ano de nascimento do primeiro menino");
        ano1 = ler.nextInt();
        System.out.println("Informe o ano de nascimento do segundo menino");
        ano2 = ler.nextInt();
        System.out.println("Informe o ano de nascimento do terceiro menino");
        ano3 = ler.nextInt();

        if (ano1 == ano2 && ano1 == ano3 ){
            System.out.println("Os tres meninos são trigemeos");
        }else{
            if (ano1 == ano2 && ano1 != ano3){
                System.out.println("O primeiro e o segundo menino são gemeos");
        }else{
            if (ano1 == ano3 && ano1 != ano2){
                System.out.println("O primeiro e o terceiro menino são gemeos");  
        }else{
            if (ano2 == ano3 && ano2 != ano1){
                System.out.println("O segundo e o terceiro menino são gemeos");             
        }else{
            System.out.println("Os meninos são apenas irmãos");
        }
    }
}}}}
