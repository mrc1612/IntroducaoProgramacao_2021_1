import java.util.Scanner;
public class Uni4Ex11 {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int a1, a2, a3;
       System.out.print("Informe o ano de nascimento do primeiro garoto: ");
       a1 = ler.nextInt();
       System.out.print("Informe o ano de nascimento do segundo garoto: ");
       a2 = ler.nextInt();
       System.out.print("Informe o ano de nascimento do terceiro garoto: ");
       a3 = ler.nextInt();
       if (a1 == a2 && a1 == a3 ) {
            System.out.println("Os garotos são trigêmeos.");
       }
       else {
            if (a1 == a2 && a1 != a3) {
                System.out.println("O primeiro e o segundo garoto são gêmeos.");
            }
            else {
                if (a1 == a3 && a1 != a2) {
                    System.out.println("O primeiro e o terceiro garoto são gêmeos.");  
                }
                else {
                    if (a2 == a3 && a2 != a1) {
                        System.out.println("O segundo e o terceiro garoto são gêmeos.");             
                }
                    else { 
                    System.out.println("Os garotos são apenas irmãos.");
                    }
                }
}}}}        